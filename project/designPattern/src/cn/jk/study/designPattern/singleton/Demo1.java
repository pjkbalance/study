package cn.jk.study.designPattern.singleton;

/**
 * Created by jiakang on 2018/8/23.
 */
public class Demo1 {
    private Demo1(){}


    //类初始化 立即加载 (加载类时天然线程安全)
    private static Demo1 instance = new Demo1();

    public static Demo1 getInstance() {
        return instance;
    }
}
