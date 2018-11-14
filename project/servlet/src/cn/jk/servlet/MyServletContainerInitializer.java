package cn.jk.servlet;

import cn.jk.servlet.filter.UserFilter;
import cn.jk.servlet.listener.UserListener;
import cn.jk.servlet.service.SCIService;
import cn.jk.servlet.servlet.UserServlet;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
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

        ServletRegistration.Dynamic userServlet = servletContext.addServlet("userServlet", new UserServlet());
        userServlet.addMapping("/user/servlet");

        servletContext.addListener(UserListener.class);

        FilterRegistration.Dynamic userFilter = servletContext.addFilter("userFilter", UserFilter.class);
//        userFilter.addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST),true,"userServlet");
        userFilter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"*//*");
    }
}
