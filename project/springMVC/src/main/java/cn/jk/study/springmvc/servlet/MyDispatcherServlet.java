package cn.jk.study.springmvc.servlet;

import cn.jk.study.springmvc.annotation.JkAutowired;
import cn.jk.study.springmvc.annotation.JkController;
import cn.jk.study.springmvc.annotation.JkRequestMapping;
import cn.jk.study.springmvc.annotation.JkService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jiakang on 2018/8/20.
 */
public class MyDispatcherServlet extends HttpServlet {
    List<String> classNames = new ArrayList<String>();
    Map<String, Object> beans = new HashMap<String, Object>();
    Map<String, Object> handlerMap = new HashMap<String, Object>();

    /**
     * 获取包下那些类需要实例化
     *
     * @param packagePath
     */
    private void scanPackage(String packagePath) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        URL url = classLoader.getResource(File.pathSeparator +
                packagePath.replaceAll("\\.", File.pathSeparator));
        String fileStr = url.getFile();
        File file = new File(fileStr);
        File fileTemp;
        for (String path : file.list()) {
            fileTemp = new File(fileStr + path);
            if (fileTemp.isDirectory()) {
                scanPackage(packagePath + "." + path);
            } else {
                //获得 class 文件，实际扫描仍需要判断
                classNames.add(packagePath + "." + path);
            }
        }
    }

    private void doInstance() {
        if (classNames.size() < 1) {
            System.out.println("扫描失败");
            return;
        }
        for (String className : classNames) {
            className = className.replace(".class", "");
            try {
                Class<?> clazz = Class.forName(className);
                //解析类注解
                if (clazz.isAnnotationPresent(JkController.class)) {
                    //使用了 JkController 注解
                    //step1 生成实例
                    Object instance = clazz.newInstance();
                    //step2 IOC map.put
                    JkRequestMapping requestMapping = (JkRequestMapping) clazz
                            .getAnnotation(JkRequestMapping.class);
                    String key = requestMapping.value();
                    beans.put(key, instance);
                } else if (clazz.isAnnotationPresent(JkService.class)) {
                    //使用了 JkService 注解
                    //step1 生成实例
                    Object instance = clazz.newInstance();
                    //step2 IOC map.put
                    JkService service = (JkService) clazz.getAnnotation(JkService.class);
                    String key = service.value();
                    beans.put(key, instance);
                } else {
                    continue;
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void doAutowired() {
        if (beans.size() < 1) {
            System.out.println("没有实例化一个类");
            return;
        }

        for (Map.Entry<String, Object> entry : beans.entrySet()) {
            Object instance = entry.getValue();
            Class<?> clazz = instance.getClass();
            if (clazz.isAnnotationPresent(JkController.class)) {
                Field[] fields = clazz.getDeclaredFields();
                for (Field field : fields) {
                    if (field.isAnnotationPresent(JkAutowired.class)) {
                        JkAutowired autowired = field.getAnnotation(JkAutowired.class);
                        String key = autowired.value();
                        field.setAccessible(true);
                        try {
                            field.set(instance, beans.get(key));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                continue;
            }
        }
    }

    private void urlMapping() {
        if (beans.size() < 1) {
            System.out.println("没有实例化一个类");
            return;
        }

        for (Map.Entry<String, Object> entry : beans.entrySet()) {
            Object instance = entry.getValue();
            Class<?> clazz = instance.getClass();
            if (clazz.isAnnotationPresent(JkController.class)) {
                JkRequestMapping requestMapping = clazz.getAnnotation(JkRequestMapping.class);
                String classPath = requestMapping.value();
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(JkRequestMapping.class)) {
                        JkRequestMapping url = method.getAnnotation(JkRequestMapping.class);
                        String methodPath = url.value();
                        handlerMap.put(classPath+methodPath, method);
                    }
                }
            } else {
                continue;
            }
        }
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        //step1 收集所有 class 类 -> classNames
        scanPackage("cn.jk.study.springmvc");
        //step2 创建实例
        doInstance();
        //step3 依赖加载
        doAutowired();
        //step4 路由
        urlMapping();
        //IOC 容器 map.put(key, instance)

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        String context = req.getContextPath();
        String path = uri.replaceFirst(context, "");
        Method method = (Method) handlerMap.get(path);
        Object instance = beans.get("/"+path.split("/")[0]);
        try {
            method.invoke(instance, new Object[] {req, resp});
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
