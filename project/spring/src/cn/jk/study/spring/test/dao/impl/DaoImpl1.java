package cn.jk.study.spring.test.dao.impl;

import cn.jk.study.spring.test.dao.Dao1;
import org.springframework.stereotype.Repository;

/**
 * Created by jiakang on 2018/8/22.
 */
@Repository
public class DaoImpl1 implements Dao1 {
    @Override
    public void test() {
        System.out.println("DaoImpl1.test()");
    }
}
