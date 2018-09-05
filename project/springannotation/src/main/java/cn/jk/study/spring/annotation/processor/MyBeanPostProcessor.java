package cn.jk.study.spring.annotation.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * //对 bean 属性进行赋值
 * populateBean(beanName, mbd, instanceWrapper) {
 *   postProcessBeforeInitialization(result, beanName);
 *   //自定义初始化 bean
 *   invokeInitMethods(beanName, wrappedBean, mbd);
 *   postProcessAfterInitialization(result, beanName);
 * }
 *
 * Created by jiakang on 2018/9/4.
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor - BeanPostProcessor - postProcessBeforeInitialization - "+beanName+" ===>>> "+bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor - BeanPostProcessor - postProcessAfterInitialization - "+beanName+" ===>>> "+bean);
        return bean;
    }
}
