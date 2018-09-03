package cn.jk.study.spring.annotation;

import cn.jk.study.spring.annotation.bean.Person;
import cn.jk.study.spring.annotation.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jiakang on 2018/9/3.
 */
public class IOCTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig.class);
    @Test
    public void test01() {
        for(String beanName : ac.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }

    @Test
    public void test02() {
        for(String beanName : ac.getBeanNamesForType(Person.class)) {
            System.out.println(beanName);
        }
    }
}
