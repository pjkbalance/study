package cn.jk.study.spring.part1.spring3;

import cn.jk.study.spring.part1.spring3.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiakang on 2018/8/16.
 */
public class Index {
    public static void main(String... args) {
        /**
         * 单例模式: 读取配置时将所有 bean 创建完毕
         * 非单例模式: 读取配置时不创建 bean 调用时创建 bean
         */
        System.out.println(" === before get beans.xml === ");
        ApplicationContext context = new ClassPathXmlApplicationContext("cn/jk/study/spring/spring/part1/spring3/beans3.xml");
        System.out.println(" === after get beans.xml === ");
        System.out.println();

        System.out.println(" === before create user1 === ");
        User user1 = (User) context.getBean("user1");
        System.out.println(" === after create user1 === ");
        System.out.println(user1);
        System.out.println();

        System.out.println(" === before create user2 === ");
        User user2 = (User) context.getBean("user2");
        System.out.println(" === after create user2 === ");
        System.out.println(user2);
        System.out.println();

        System.out.println(" === before create user3 === ");
        User user3 = (User) context.getBean("user3");
        System.out.println(" === after create user3 === ");
        System.out.println(user3);
        System.out.println();

        System.out.println(" === before create user4 === ");
        User user4 = (User) context.getBean("user4");
        System.out.println(" === after create user4 === ");
        System.out.println(user4);
        System.out.println();
    }
}
