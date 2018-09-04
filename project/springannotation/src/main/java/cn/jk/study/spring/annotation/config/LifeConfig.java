package cn.jk.study.spring.annotation.config;

import cn.jk.study.spring.annotation.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * bean 生命周期
 *
 * 创建
 *   单实例
 *     懒加载 - 第一次调用时创建
 *     非懒加载 - 容器创建时创建
 *   多实例 - 每次调用时创建
 * 初始化 - 可自定义
 *   创建 bean 完成，并且赋值完成之后调用
 * 销毁 - 可自定义
 *   单实例 - 容器关闭
 *   多实例 - 不进行销毁，即：对于多实例 spring 只负责创建，不负责管理
 *
 * 指定初始化方法、销毁方法
 *   1. @Bean 注解指定 initMethod / destroyMethod - cn.jk.study.spring.annotation.bean.Car
 *   2. bean 实现 InitializingBean / DisposableBean 接口 - cn.jk.study.spring.annotation.bean.Car
 *   3. bean 中方法使用 @PostConstruct / @PreDestroy 注解 (JSR250定义) - cn.jk.study.spring.annotation.bean.Car
 *   4. 实现 BeanPostProcessor 接口 (bean 后置处理器) - cn.jk.study.spring.annotation.processor.MyBeanPostProcessor
 *
 * Created by jiakang on 2018/9/4.
 */
@ComponentScan("cn.jk.study.spring.annotation.processor")
public class LifeConfig {
    //@Lazy
    //@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean(value = "car", initMethod = "classInit", destroyMethod = "classDestroy")
    public Car car() {
        return new Car();
    }
}
