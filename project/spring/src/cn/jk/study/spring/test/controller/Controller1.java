package cn.jk.study.spring.test.controller;

import cn.jk.study.spring.test.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by jiakang on 2018/8/22.
 */
@Controller
public class Controller1 {
    @Resource(name="serviceImpl2")
    private Service1 serviceImpl1;

    public void test() {
        serviceImpl1.test();
    }
}
