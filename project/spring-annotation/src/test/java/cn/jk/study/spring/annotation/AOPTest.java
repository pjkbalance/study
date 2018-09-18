package cn.jk.study.spring.annotation;

import cn.jk.study.spring.annotation.config.AOPConfig;
import cn.jk.study.spring.annotation.service.MathCalculator;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jiakang on 2018/9/6.
 */
public class AOPTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AOPConfig.class);
        MathCalculator cal = (MathCalculator) ac.getBean(MathCalculator.class.getName());
        MathCalculator cal1 = new MathCalculator();
        System.out.println(cal.div(9, 3));
        System.out.println(cal.doubleI(4));
        System.out.println(cal.getZero());
        //System.out.println(cal.div(1,0));
        ac.close();
    }
}
