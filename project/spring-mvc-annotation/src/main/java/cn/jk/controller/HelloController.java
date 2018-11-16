package cn.jk.controller;

import cn.jk.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jiakang on 2018/11/16.
 */
@Controller
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return helloService.hello("J.K");
    }
}
