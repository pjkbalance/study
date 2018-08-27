package cn.jk.study.spring.part1.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by jiakang on 2018/8/27.
 */
public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();
    /**
     * 创建代理类对象
     * 参数：委托类Class对象
     * 返回值：代理类对象
     */
    private Object createProxyObject(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 代理类执行委托类方法
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object result = methodProxy.invokeSuper(o,args);
        System.out.println("eat");
        System.out.println(result);
        return result;
    }

    public static void main(String... args) {
        CglibProxy proxy = new CglibProxy();
        Animal cat = (Animal) proxy.createProxyObject(Cat.class);
        cat.eat();
    }
}
