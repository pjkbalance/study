package cn.jk.study.spring.annotation.config;

import cn.jk.study.spring.annotation.bean.Boss;
import cn.jk.study.spring.annotation.bean.Car;
import cn.jk.study.spring.annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.concurrent.Callable;

/**
 * @see cn.jk.study.spring.annotation.service.BookService
 * 自动装配
 *   spring 使用依赖注入 (DI) 完成对 IOC 容器中各组件之间依赖关系的赋值
 *
 * @Autowired 自动注入
 *   1. 优先使用按照类型去容器中找到对应的组件 (ApplicationContext.getBean(Class<T>))
 *   2. 如果找到多个，则讲属性名称作为组件 id 到容器中查找
 *   3. 如果没有找到，则报错；除非设定 @Autowired(required=false)
 * 使用位置 均为从 IOC 容器中获取
 * @see cn.jk.study.spring.annotation.bean.Boss
 *   构造器: 有参构造器，若组件只有一个有参构造器，则可以省略 @Autowired
 *   方法: spring 容器创建当前对象时会调用方法完成赋值；一般加在 set 方法上；可以省略 @Autowired
 *   参数: @Bean 创建对象时，方法参数从容器中获取；可以省略 @Autowired
 *
 * @Qualifier 对应 @Autowired 2 使用指定名称加载属性，而不是根据属性名称加载
 *
 * @Primary 定义对象；在没有明确指定 @Qualifier 的情况下，让 spring 在自动装配时，默认使用该对象
 *
 *
 * @Resource (JSR250): 自动注入，优先使用名称装配；不支持 @Primary 及 required
 * @Inject (JSR330): 需导入 Java Inject 包；功能与 @Autowired 一样，不支持 required
 *
 * 自动加载 Spring 底层组件 实现 xxxAware 接口
 *
 *
 * Created by jiakang on 2018/9/5.
 */
@Configuration
@ComponentScan({
        "cn.jk.study.spring.annotation.service",
        "cn.jk.study.spring.annotation.dao"
})
public class AutowiredConfig {
    @Bean
    @Primary
    public BookDao bookDao1() {
        BookDao dao = new BookDao();
        dao.setLabel("1");
        return dao;
    }

    @Bean
    public Boss boss(Car car) {
        return new Boss(car);
    }

    @Bean
    public Car car() {
        return new Car();
    }
}
