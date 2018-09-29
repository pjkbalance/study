package cn.jk.study.spring.tx.service;

import cn.jk.study.spring.tx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jiakang on 2018/9/19.
 */
@Service
public class UserService {
    @Autowired
    private UserDao dao;
    @Transactional
    public void insert() {
        dao.insert("5");
        String a = null;
        //System.out.println("result = "+a.equals("1"));
    }
}
