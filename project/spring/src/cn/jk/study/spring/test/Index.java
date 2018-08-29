package cn.jk.study.spring.test;

import cn.jk.study.spring.test.controller.Controller1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiakang on 2018/8/22.
 */
public class Index {
    public static void main(String... args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/jk/study/spring/test/beans.xml");
        Controller1 controller1 = (Controller1) ac.getBean("controller1");
        controller1.test();
    }
}
