package cn.jk.study.springmvc.service.impl;

import cn.jk.study.springmvc.service.MyService;
import org.springframework.stereotype.Service;
import sun.security.mscapi.KeyStore;

/**
 * Created by jiakang on 2018/8/28.
 */
@Service
public class TestImpl implements MyService {
    public String query(String name, int age) {
        return "test";
    }
}
