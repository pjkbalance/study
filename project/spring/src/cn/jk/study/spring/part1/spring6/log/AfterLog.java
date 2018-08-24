package cn.jk.study.spring.part1.spring6.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by jiakang.peng on 2018/8/19.
 */
public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() +
                "." +
                method.getName() +
                "(" +
                args +
                ") is executed, " +
                "the return value is " +
                returnValue +
                "\n");
    }
}
