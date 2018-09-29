package cn.jk.study.spring.ext;

import cn.jk.study.spring.ext.config.ExtConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jiakang on 2018/9/25.
 */
public class ExtTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ExtConfig.class);
        for(String beanName:ac.getBeanDefinitionNames()) {
            //System.out.println(beanName);
        }
        ac.close();
    }
}
