package cn.jk.study.designPattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * Created by jiakang on 2018/8/23.
 */
public class Test2 {
    public static void main(String... args) throws IOException, ClassNotFoundException {
        Demo6 d1 = Demo6.getInstance();
        Demo6 d2 = Demo6.getInstance();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println("====================================");

        //序列化
        FileOutputStream fos = new FileOutputStream("G:/test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.close();
        fos.close();

        //反序列化
        FileInputStream fis = new FileInputStream("G:/test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Demo6 d3 = (Demo6) ois.readObject();
        ois.close();
        fis.close();


        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
