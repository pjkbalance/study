package cn.jk.study.spring.part1.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiakang on 2018/8/16.
 */
public class Index {
    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("cn/jk/study/spring/spring/part1/spring1/beans1.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.hello();
    }
}
