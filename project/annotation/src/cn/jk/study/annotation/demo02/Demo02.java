package cn.jk.study.annotation.demo02;

/**
 * Created by jiakang on 2018/8/20.
 */
//@MyAnnotation1
@MyAnnotation2(value = "value")
public class Demo02 {
    @MyAnnotation1(value = "value", studentName = "studentName")
    public void test1() {

    }

    @MyAnnotation2("value")
    public void test2() {

    }
}
