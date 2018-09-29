package cn.jk.study.spring.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Created by jiakang on 2018/9/25.
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("共定义 "+beanFactory.getBeanDefinitionCount()+" 个beans；名称如下");
        int i = 0;
        for(String beanName: beanFactory.getBeanDefinitionNames()) {
            System.out.println(++i + " --- "+beanName);
        }
    }
}
