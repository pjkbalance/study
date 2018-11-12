package cn.jk.servlet;

import cn.jk.servlet.service.SCIService;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * Created by jiakang on 2018/11/12.
 */
@HandlesTypes(SCIService.class)
public class MyServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println(" my servlet container initializer ");
        for (Class clz :
                set) {
            System.out.println("==="+clz.getName());

        }

    }
}
