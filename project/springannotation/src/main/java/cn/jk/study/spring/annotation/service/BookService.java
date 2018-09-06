package cn.jk.study.spring.annotation.service;

import cn.jk.study.spring.annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by jiakang on 2018/9/5.
 */
@Service
public class BookService {
    /*
    @Autowired(required = false)
    //@Qualifier("bookDao2")
     */
    @Resource(name="bookDao1")
    private BookDao bookDao;

    @Override
    public String toString() {
        System.out.println(bookDao);
        return "BookService";
    }
}
