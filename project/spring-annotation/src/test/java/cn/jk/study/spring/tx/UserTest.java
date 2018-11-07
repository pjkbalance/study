package cn.jk.study.spring.tx;

import cn.jk.study.spring.tx.config.TxConfig;
import cn.jk.study.spring.tx.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiakang on 2018/9/19.
 */
public class UserTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService service = ac.getBean(UserService.class);
        service.insert();

        ApplicationContext app = new ClassPathXmlApplicationContext();
    }
}
