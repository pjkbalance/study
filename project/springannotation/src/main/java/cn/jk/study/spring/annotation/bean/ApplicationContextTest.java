package cn.jk.study.spring.annotation.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @see org.springframework.context.support.ApplicationContextAwareProcessor
 * Created by jiakang on 2018/9/5.
 */
@Component
public class ApplicationContextTest implements ApplicationContextAware{
    private ApplicationContext ac;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ac = applicationContext;
    }
}
