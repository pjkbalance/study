package cn.jk.service;

import org.springframework.stereotype.Service;

/**
 * Created by jiakang on 2018/11/16.
 */
@Service
public class HelloService {
    public String hello(String name) {
        return "Hello " + name;
    }
}
