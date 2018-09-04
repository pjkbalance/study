package cn.jk.study.spring.annotation;

import cn.jk.study.spring.annotation.bean.Person;
import cn.jk.study.spring.annotation.config.BeanConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jiakang on 2018/9/3.
 */
public class IOCTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
    @Test
    public void test01() {
        for(String beanName : ac.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

        Object bean;
        bean = ac.getBean("colorFactoryBean");
        System.out.println(bean.getClass());
        bean = ac.getBean("&colorFactoryBean");
        System.out.println(bean.getClass());
    }

    @Test
    public void test02() {
        for(String beanName : ac.getBeanNamesForType(Person.class)) {
            System.out.println(beanName);
        }
    }
}
