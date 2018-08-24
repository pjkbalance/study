package cn.jk.study.designPattern.singleton;

/**
 * Created by jiakang on 2018/8/23.
 */
public class Demo2 {
    private Demo2(){}


    private static Demo2 instance;

    /**
     * 需要手动同步
     */
    public static synchronized Demo2 getInstance() {
        if (instance == null) {
            instance = new Demo2();
        }
        return instance;
    }
}
