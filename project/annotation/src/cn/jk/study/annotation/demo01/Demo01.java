package cn.jk.study.annotation.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiakang on 2018/8/20.
 */
public class Demo01 {
    //@Override 编译器解析到该方法应该为重写，因此会报错
    public String tostring() {
        return "";
    }

    @Override
    public String toString() {
        return "";
    }


    @Deprecated
    public static void test1() {
        System.out.println("@Deprecated");
    }

    public static void main(String... args) {
        test1();
    }


    //@SuppressWarnings("all")
    public static void test2() {
        List list = new ArrayList();
    }
}
