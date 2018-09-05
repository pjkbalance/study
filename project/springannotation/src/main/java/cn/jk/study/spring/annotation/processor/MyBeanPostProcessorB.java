package cn.jk.study.spring.annotation.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by jiakang on 2018/9/4.
 */
@Component
public class MyBeanPostProcessorB implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessorB - BeanPostProcessor - postProcessBeforeInitialization - "+beanName+" ===>>> "+bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessorB - BeanPostProcessor - postProcessAfterInitialization - "+beanName+" ===>>> "+bean);
        return bean;
    }
}
