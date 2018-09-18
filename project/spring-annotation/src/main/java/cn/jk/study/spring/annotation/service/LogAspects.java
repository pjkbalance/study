package cn.jk.study.spring.annotation.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * 通知方法
 *   前置 @Before - logStart
 *   后置 @After - logEnd - 无论是否报错
 *   返回 @AfterReturning - logReturn
 *   异常 @AfterThrowing - lorException
 *   环绕 @Around - logAround - 手动推进目标方法进行 (joinPoint.processed)
 * 注解参数为: 方法定义 / @Pointcut注释的方法
 *
 * @Pointcut("execution(public ...)") 抽取公共的切入点表达式
 * 本类使用: 直接使用方法名
 * 其他切面引用: 包含包路径的全名
 * <p>
 * JoinPoint 参数必须在参数列表第一位
 * <p>
 * Created by jiakang on 2018/9/6.
 */

@Aspect
public class LogAspects {
    @Pointcut("execution(public * cn.jk.study.spring.annotation.service.MathCalculator.*(..))")
    private void pointcut() {
    }

    @Before(value = "pointcut()")
    public void beforePointcut(JoinPoint joinPoint) {
        System.out.println("\n\nbefore " +
                joinPoint.getSignature().getDeclaringType() +
                "." +
                joinPoint.getSignature().getName() +
                "(" +
                Arrays.asList(joinPoint.getArgs()) +
                ")");
    }

    @After("pointcut()")
    public void afterPointcut(JoinPoint joinPoint) {
        System.out.println("after " +
                joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "pointcut()", returning = "result")
    public void afterPointcutReturning(JoinPoint joinPoint, Object result) {
        System.out.println("after " +
                joinPoint.getSignature().getName() +
                " return "
                + result);
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "e")
    public void afterPointcutThrowing(JoinPoint joinPoint, Exception e) {
        System.out.println("after " +
                joinPoint.getSignature().getName() +
                " throw "
                + e);
    }

    @Around("execution(public * cn.jk.study.spring.annotation.service.MathCalculator.doubleI(..))")
    public Object aroundPointcut(ProceedingJoinPoint joinPoint) {
        System.out.println("@Around " +
                joinPoint.getSignature().getDeclaringType() +
                "." +
                joinPoint.getSignature().getName() +
                "(" +
                Arrays.asList(joinPoint.getArgs()) +
                ")");
        try {
            Object obj = joinPoint.proceed(joinPoint.getArgs());
            System.out.println("@Around after " +
                    joinPoint.getSignature().getName());
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return -1;
    }
}
