package cn.jk.study.spring.part2.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiakang on 2018/8/22.
 */
public class Index {
    public static void main(String... args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/jk/study/spring/spring/part2/demo1/beans1.xml");
        ac = new ClassPathXmlApplicationContext("cn/jk/study/spring/spring/part2/demo1/beans2.xml");
        /*EmailEvent event = new EmailEvent("test", "pjk@123.com", "text");
        System.out.println("=============");
        ac.publishEvent(event);*/
    }
}
