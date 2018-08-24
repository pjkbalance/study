package cn.jk.study.spring.part1.spring2.dao.impl;

import cn.jk.study.spring.part1.spring2.dao.UserDao;

/**
 * Created by jiakang on 2018/8/16.
 */
public class UserMySqlDaoImpl implements UserDao {
    @Override
    public void getUserInfo() {
        System.out.println("mysql - get user info");
    }
}
