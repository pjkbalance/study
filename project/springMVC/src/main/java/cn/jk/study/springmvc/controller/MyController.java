package cn.jk.study.springmvc.controller;

import cn.jk.study.springmvc.annotation.JkAutowired;
import cn.jk.study.springmvc.annotation.JkController;
import cn.jk.study.springmvc.annotation.JkRequestMapping;
import cn.jk.study.springmvc.annotation.JkRequestParam;
import cn.jk.study.springmvc.service.MyService;
import cn.jk.study.springmvc.service.impl.MyServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jiakang on 2018/8/20.
 */
@JkController
@JkRequestMapping("/jk")
public class MyController {
    @JkAutowired("myService")
    private MyService myService;

    @JkRequestMapping("/query")
    public void query(HttpServletRequest request,
                      HttpServletResponse response,
                      @JkRequestParam("name") String name,
                      @JkRequestParam("age") int age){
        PrintWriter pw = null;
        try {
            pw = response.getWriter();
            String result = myService.query(name, age);
            pw.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
