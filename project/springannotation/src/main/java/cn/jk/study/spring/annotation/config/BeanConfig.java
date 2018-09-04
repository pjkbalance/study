package cn.jk.study.spring.annotation.config;

import cn.jk.study.spring.annotation.bean.Color;
import cn.jk.study.spring.annotation.bean.Person;
import cn.jk.study.spring.annotation.condition.Condition1;
import cn.jk.study.spring.annotation.condition.Condition2;
import cn.jk.study.spring.annotation.factoy.ColorFactoryBean;
import cn.jk.study.spring.annotation.importConfig.MyImportBeanDefinitionRegistrar;
import cn.jk.study.spring.annotation.importConfig.MyImportSelector;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

/**
 * Created by jiakang on 2018/9/3.
 */

//定义配置类，作用相当于配置文件

@Configuration
/**
 * value: 指定要扫描的包
 * excludeFilters=Filter[] 按何种规则排除组件
 * includeFilters=Filter[] 与excludeFilters对应，需设置 useDefaultFilters=false
 * FilterType
 *  ANNOTATION 注解
 *  ASSIGNABLE_TYPE 给定类型
 *  ASPECTJ ASPECTJ表达式
 *  REGEX 正则表达式
 *  CUSTOM 自定义
 */
@ComponentScan(basePackages = "cn.**.annotation"/*, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = PersonBakService.class)
        @ComponentScan.Filter(type = FilterType.CUSTOM, value = MyFilterType.class)

}*/)
/**
 * 在 spring 中注册组件的方式
 * 1. 包扫描 + 组件标注注解 (@Controller/@Service...) [自己定义的类]
 * 2. @Bean [导入第三方包中的注解]
 * 3. @Import [快速给容器中导入组件]
 *   @Import({
 *     需要导入组件的 class,
 *     继承 ImportSelector 接口的类的 class,
 *     继承 ImportBeanDefinitionRegistrar 接口的类的 class,
 *   })
 * 4. 使用 spring 提供的 FactoryBean 接口 (cn.jk.study.spring.annotation.factoy.ColorFactoryBean)
 */
@Import({
        Color.class,
        MyImportSelector.class,
        MyImportBeanDefinitionRegistrar.class
})
public class BeanConfig {
    @Bean("personClass")
    //非单例模式 @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    /**
     * 若不添加 @Lazy 标签，默认为非懒加载模式
     * @Lazy
     */
    public Person person() {
        return new Person("lisi", 14);
    }

    @Bean("person01")
    @Conditional(Condition1.class)
    public Person person1() {
        return new Person("001", 1);
    }

    @Bean("person02")
    @Conditional(Condition2.class)
    public Person person2() {
        return new Person("002", 1);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
