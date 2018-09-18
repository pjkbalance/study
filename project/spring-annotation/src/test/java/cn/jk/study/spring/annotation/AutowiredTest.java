package cn.jk.study.spring.annotation;

import cn.jk.study.spring.annotation.bean.Boss;
import cn.jk.study.spring.annotation.config.AutowiredConfig;
import cn.jk.study.spring.annotation.dao.BookDao;
import cn.jk.study.spring.annotation.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jiakang on 2018/9/5.
 */
public class AutowiredTest {

    @Test
    public void test() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutowiredConfig.class);
        BookService service = ac.getBean(BookService.class);
//        System.out.println(service);

        Boss boss = ac.getBean(Boss.class);
        System.out.println("boss ===>>> "+boss);
    }
}
