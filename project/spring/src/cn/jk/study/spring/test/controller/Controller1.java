package cn.jk.study.spring.test.controller;

import cn.jk.study.spring.test.service.Service1;

import javax.annotation.Resource;

/**
 * Created by jiakang on 2018/8/22.
 */
public class Controller1 {
    @Resource
    private Service1 service1;

    public void test() {
        service1.test();
    }
}
