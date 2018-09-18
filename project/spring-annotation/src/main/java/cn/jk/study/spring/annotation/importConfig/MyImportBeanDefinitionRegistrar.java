package cn.jk.study.spring.annotation.importConfig;

import cn.jk.study.spring.annotation.bean.Rainbow;
import cn.jk.study.spring.annotation.bean.Red;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by jiakang on 2018/9/4.
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * 将所有需要添加到容器的 bean 调用 BeanDefinitionRegistry.registerBeanDefinition 方法注册
     * @param importingClassMetadata 当前注解 @Import 的类的所有注解信息
     * @param registry BeanDefinition 注册类
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //容器中注册了 Red
        if (registry.containsBeanDefinition(Red.class.getName())) {
            registry.registerBeanDefinition("rainbow", new RootBeanDefinition(Rainbow.class));
        }
    }
}
