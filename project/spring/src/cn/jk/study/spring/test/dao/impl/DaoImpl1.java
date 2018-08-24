package cn.jk.study.spring.test.dao.impl;

import cn.jk.study.spring.test.dao.Dao1;

/**
 * Created by jiakang on 2018/8/22.
 */
public class DaoImpl1 implements Dao1 {
    @Override
    public void test() {
        System.out.println("DaoImpl1.test()");
    }
}
