package cn.jk.study.spring.part1.spring6.log;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;

import java.lang.reflect.Method;

/**
 * Created by jiakang.peng on 2018/8/19.
 */
public class BeforeLog implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before execute " +
                target.getClass().getName() +
                "." +
                method.getName() +
                "(" +
                args +
                ")");
    }
}
