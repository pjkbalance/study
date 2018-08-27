package cn.jk.study.designPattern.test;

import cn.jk.study.designPattern.singleton.Demo1;
import cn.jk.study.designPattern.singleton.Demo2;
import sun.java2d.SurfaceDataProxy;

import java.util.concurrent.CountDownLatch;

/**
 * Created by jiakang on 2018/8/23.
 */
public class TestSingleton {
    public static void main(String... args) throws InterruptedException {
        //等待线程的个数
        int num = 100;
        final CountDownLatch c = new CountDownLatch(num);

        long start = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        Demo1 d = Demo1.getInstance();
                    }
                    //num--
                    c.countDown();
                }
            }).start();
        }

        //main线程阻塞 直到计数器变为0才继续执行 - 本质是循环监测
        c.await();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
