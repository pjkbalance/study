package cn.jk.study.spring.annotation;

import cn.jk.study.spring.annotation.config.ProfileConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

/**
 * Created by jiakang on 2018/9/6.
 */
public class ProfileTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.getEnvironment().setActiveProfiles("guns");
        ac.register(ProfileConfig.class);
        ac.refresh();

        for (String beanName :
                ac.getBeanNamesForType(DataSource.class)) {
            System.out.println(beanName);
        }

        System.out.printf("================================");

        /*ac.getEnvironment().setActiveProfiles("chac");
        ac.refresh();
        for (String beanName :
                ac.getBeanNamesForType(DataSource.class)) {
            System.out.println(beanName);
        }*/
    }
}
