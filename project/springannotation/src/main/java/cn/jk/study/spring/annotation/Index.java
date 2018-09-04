package cn.jk.study.spring.annotation;

import cn.jk.study.spring.annotation.bean.Person;
import cn.jk.study.spring.annotation.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiakang on 2018/9/3.
 */
public class Index {
    private static void beanConfig() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Person p = (Person) ac.getBean("person");
        System.out.println(p);
        System.out.println("===========================================");
        for(String beanName : ac.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
        System.out.println("===========================================\r\n");
    }
    private static void classConfig() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
        //Person p = (Person) ac.getBean("personClass");
        //System.out.println(p);
        /*
        System.out.println("===========================================");
        for(String beanName : ac.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
        System.out.println("===========================================\r\n");
         */
    }

    public static void main(String... args) {
        //beanConfig();
        classConfig();
    }
}
