package cn.jk.study.designPattern.singleton;

/**
 * Created by jiakang on 2018/8/23.
 */
public class Demo4 {
    private Demo4(){}


    //静态内部类 不会立即加载
    private static class Instance{
        //加载类时线程安全
        private static Demo4 instance = new Demo4();
    }
    public static Demo4 getInstance() {
        return Instance.instance;
    }
}
