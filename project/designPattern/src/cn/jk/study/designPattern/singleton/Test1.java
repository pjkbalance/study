package cn.jk.study.designPattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by jiakang on 2018/8/23.
 */
public class Test1 {
    public static void main(String... args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Demo6 d1 = Demo6.getInstance();
        Demo6 d2 = Demo6.getInstance();

        System.out.println(d1);
        System.out.println(d2);

        Class clazz = Class.forName("cn.jk.study.designPattern.singleton.Demo6");
        Constructor<Demo6> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Demo6 d3 = c.newInstance();
        System.out.println(d3);
    }
}
