package cn.jk.study.spring.part1.spring2;

import cn.jk.study.spring.part1.spring2.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiakang on 2018/8/16.
 */
public class Index {
    public static void main(String... args){
        ApplicationContext context = new ClassPathXmlApplicationContext("cn/jk/study/spring/spring/part1/spring2/beans2.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.getUserInfo();

    }
}
