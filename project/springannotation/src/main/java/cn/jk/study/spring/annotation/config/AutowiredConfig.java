package cn.jk.study.spring.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动装配
 *   spring 使用依赖注入 (DI) 完成对 IOC 容器中各组件之间依赖关系的赋值
 *
 * @Autowired 自动注入
 *   1. 优先使用按照类型去容器中找到对应的组件 (ApplicationContext.getBean(Class<T>))
 *   2. 如果找到多个，则讲属性名称作为组件 id 到容器中查找
 *   3. 如果没有找到，则报错；除非设定 @Autowired(required=false)
 *
 * @Qualifier 对应 @Autowired 2 使用指定名称加载属性，而不是根据属性名称加载
 *
 * @Primary 定义对象；在没有明确指定 @Qualifier 的情况下，让 spring 在自动装配时，默认使用该对象
 *
 * Created by jiakang on 2018/9/5.
 */
@Configuration
@ComponentScan({
        "cn.jk.study.spring.annotation.controller",
        "cn.jk.study.spring.annotation.service",
        "cn.jk.study.spring.annotation.dao"
})
public class AutowiredConfig {
}
