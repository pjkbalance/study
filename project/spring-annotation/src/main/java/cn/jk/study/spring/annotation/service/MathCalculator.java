package cn.jk.study.spring.annotation.service;

import org.springframework.context.annotation.Import;

/**
 * Created by jiakang on 2018/9/6.
 */
@Import({
        LogAspects.class
})
public class MathCalculator {
    public double div (int i, int j) {
        System.out.println("MathCalculator.div("+i+", "+j+")");
        return i/j;
    }
    public int doubleI (int i) {
        System.out.println("MathCalculator.doubleI("+i+")");
        return i*2;
    }
    public int getZero() {
        System.out.println("MathCalculator.getZero()");
        return 0;
    }
}
