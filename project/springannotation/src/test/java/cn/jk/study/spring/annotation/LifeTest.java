package cn.jk.study.spring.annotation;

import cn.jk.study.spring.annotation.config.LifeConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jiakang on 2018/9/4.
 */
public class LifeTest {
    @Test
    public void test1() {
        System.out.println("\n===>>> spring start create\n");
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(LifeConfig.class);
        System.out.println("\n<<<=== spring is created\n");
        ac.getBean("car");
        System.out.println("\n===>>> spring start close\n");
        ac.close();
        System.out.println("\n<<<=== spring is closed\n");

    }
}
