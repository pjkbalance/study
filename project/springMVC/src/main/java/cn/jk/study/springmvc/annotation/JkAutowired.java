package cn.jk.study.springmvc.annotation;

import java.lang.annotation.*;

/**
 * Created by jiakang on 2018/8/20.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JkAutowired {
    String value() default "";
}
