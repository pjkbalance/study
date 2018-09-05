package cn.jk.study.spring.annotation.service;

import cn.jk.study.spring.annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by jiakang on 2018/9/5.
 */
@Service
public class BookService {
    @Autowired
    private BookDao dao;

    @Override
    public String toString() {
        System.out.println(dao);
    }
}
