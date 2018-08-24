package cn.jk.study.springmvc.test;

import cn.jk.study.springmvc.servlet.MyDispatcherServlet;
import org.junit.Test;

import javax.servlet.ServletException;

/**
 * Created by jiakang on 2018/8/21.
 */
public class ServletTest {
    MyDispatcherServlet servlet = new MyDispatcherServlet();

    @Test
    public void testScanPackage() {
        try {
            servlet.init();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
