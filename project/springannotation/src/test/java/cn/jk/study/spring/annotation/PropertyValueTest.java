package cn.jk.study.spring.annotation;

import cn.jk.study.spring.annotation.bean.Person;
import cn.jk.study.spring.annotation.config.PropertyValueConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * Created by jiakang on 2018/9/5.
 */
public class PropertyValueTest {
    @Test
    public void test() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(PropertyValueConfig.class);
        if (false) {
            for (String beanName :
                    ac.getBeanDefinitionNames()) {
                System.out.println(beanName);
            }
        }
        Person p = (Person) ac.getBean(Person.class);
        System.out.println(p);

        Environment e = ac.getEnvironment();
        System.out.println(e.getProperty("person.nickname"));
    }
}
