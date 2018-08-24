package cn.jk.study.annotation.demo03;

import cn.jk.study.annotation.demo03.annotation.JkTable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by jiakang on 2018/8/20.
 */
public class Demo03 {
    public static void main(String... args) {
        try {
            Class clazz = Class.forName("cn.jk.study.annotation.demo03.bean.Student");
            for (Annotation a : clazz.getAnnotations()) {
                System.out.println(a);
                System.out.println(((JkTable) a).value());
            }
            System.out.println();
            System.out.println("---------------------1");

            JkTable table = (JkTable) clazz.getAnnotation(JkTable.class);
            System.out.println(table.value());
            System.out.println();
            System.out.println("---------------------2");

            for (Field field : clazz.getDeclaredFields()) {
                System.out.println(field.getName());
                for(Annotation a : field.getAnnotations()) {
                    System.out.println(a);
                }
                System.out.println();
            }
            System.out.println("---------------------3");

            for (Annotation a : clazz.getDeclaredAnnotations()) {
                System.out.println(a);
            }
            System.out.println("---------------------4");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
