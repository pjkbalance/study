package cn.jk.study.designPattern.singleton;

/**
 * Created by jiakang on 2018/8/23.
 */
public class Test {
    public static void main(String... args) {
        System.out.println(Demo1.getInstance());
        System.out.println(Demo1.getInstance());

        Demo5.INSTANCE.singletonOperation();
    }
}
