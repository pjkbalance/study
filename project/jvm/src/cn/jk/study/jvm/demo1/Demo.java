package cn.jk.study.jvm.demo1;

/**
 * Created by jiakang on 2018/8/29.
 */
public class Demo {
    public static void main(String... args) {
        Demo d = new Demo();
        System.out.println(d.getClass().getClassLoader());

    }
}
