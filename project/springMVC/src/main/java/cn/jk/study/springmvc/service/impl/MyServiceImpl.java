package cn.jk.study.springmvc.service.impl;

import cn.jk.study.springmvc.annotation.JkService;
import cn.jk.study.springmvc.service.MyService;

/**
 * Created by jiakang on 2018/8/20.
 */
//map.put("myService", new MyServiceImpl())
@JkService("myService")
public class MyServiceImpl implements MyService {
    public String query(String name, int age) {
        return "query result by name(" +
                name +
                ") & age(" +
                age +
                ")";
    }
}
