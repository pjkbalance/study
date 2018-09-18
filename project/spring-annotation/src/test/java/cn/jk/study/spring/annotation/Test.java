package cn.jk.study.spring.annotation;

import cn.jk.study.spring.annotation.config.TestConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jiakang on 2018/9/12.
 */
public class Test {
    @org.junit.Test
    public void test() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);

    }
}
