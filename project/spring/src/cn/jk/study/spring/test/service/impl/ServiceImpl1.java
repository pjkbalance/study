package cn.jk.study.spring.test.service.impl;

import cn.jk.study.spring.test.service.Service1;
import org.springframework.stereotype.Service;

/**
 * Created by jiakang on 2018/8/22.
 */
@Service
public class ServiceImpl1 implements Service1 {
    @Override
    public void test() {
        System.out.println("ServiceImpl1.test()");
    }
}
