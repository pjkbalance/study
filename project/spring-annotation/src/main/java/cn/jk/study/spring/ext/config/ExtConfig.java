package cn.jk.study.spring.ext.config;

import cn.jk.study.spring.annotation.bean.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @see cn.jk.study.spring.ext.MyBeanFactoryPostProcessor
 * BeanFactoryPostProcessor: BeanFactory 后置处理器，BeanFactory 标准初始化调用——所有bean定义已经保存加载到beanFactory中，但是BeanFactory还未创建任何bean实例
 *
 * Created by jiakang on 2018/9/25.
 */
@Configuration
@ComponentScan(basePackages = "cn.jk.study.spring.ext")
public class ExtConfig {
    @Bean
    public Color color() {
        return new Color();
    }
}
