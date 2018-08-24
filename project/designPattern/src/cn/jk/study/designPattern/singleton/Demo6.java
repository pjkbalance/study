package cn.jk.study.designPattern.singleton;

import java.io.Serializable;

/**
 * Created by jiakang on 2018/8/23.
 */
public class Demo6 implements Serializable{
    private Demo6(){
        //防止反射创建第二个实例
        if (Instance.instance != null) {
            throw new RuntimeException("cannot create instance");
        }
    }

    //基于回调方法 反序列化时，直接返回第一个实例
    private Object readResolve() {
        return Instance.instance;
    }


    private static class Instance{
        //加载类时线程安全
        private static Demo6 instance = new Demo6();
    }
    public static Demo6 getInstance() {
        return Instance.instance;
    }
}