package cn.jk.study.spring.annotation.config;

import cn.jk.study.spring.annotation.service.LogAspects;
import cn.jk.study.spring.annotation.service.MathCalculator;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * 1. 导入 AOP 模块 - spring-aspects
 * 2. 分析业务逻辑类
 *   @see cn.jk.study.spring.annotation.service.MathCalculator
 * 3. 定义日志切面类 - 使用 @Aspect 注解
 *   @see cn.jk.study.spring.annotation.service.LogAspects
 * 4. 使用注解定义合适运行切面
 * 5. 注册 业务逻辑类 及 切面类
 * 6. 在配置类中加 @EnableAspectJAutoProxy 开启基于注解的 AOP 模式
 *
 * @EnableAspectJAutoProxy
 * 1. import org.springframework.context.annotation.AspectJAutoProxyRegistrar
 * 2.
 *
 * Created by jiakang on 2018/9/6.
 */

@Import({
        LogAspects.class,
        MathCalculator.class
})
@EnableAspectJAutoProxy
@Configuration
public class AOPConfig {
}
