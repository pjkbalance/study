package cn.jk.study.spring.annotation.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by jiakang on 2018/9/4.
 */

public class Car implements InitializingBean, DisposableBean {
    public Car() {
        System.out.println("Car constructor");
    }

    public void classInit() {
        System.out.println("Car classInit");
    }

    public void classDestroy() {
        System.out.println("Car classDestroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Car - implements InitializingBean - afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Car - implements DisposableBean - destroy");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Car - @PostConstruct - postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Car - @PreDestroy - preDestroy");
    }
}
