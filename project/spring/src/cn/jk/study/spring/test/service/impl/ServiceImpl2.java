package cn.jk.study.spring.test.service.impl;

import cn.jk.study.spring.test.service.Service1;
import org.springframework.stereotype.Service;

/**
 * Created by jiakang on 2018/8/28.
 */
@Service
public class ServiceImpl2 implements Service1 {
    @Override
    public void test() {
        System.out.println("ServiceImpl2.test()");
    }
}
