package cn.jk.study.spring.part1.spring8.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by jiakang.peng on 2018/8/19.
 */
@Aspect
public class Log {
    @Before("execution(* cn.jk.study.spring8.service.impl.*.*(..))")
    public void before() {
        System.out.println("before execute method");
    }

    @After("execution(* cn.jk.study.spring8.service.impl.*.*(..))")
    public void after() {
        System.out.println("after execute method");
    }

    @Around("execution(* cn.jk.study.spring8.service.impl.*.*(..))")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("around start " + jp.getSignature());
        Object obj = jp.proceed();
        System.out.println("around end");
        return obj;
    }
}
