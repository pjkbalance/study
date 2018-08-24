package cn.jk.study.spring.part1.spring2.service.impl;

import cn.jk.study.spring.part1.spring2.dao.UserDao;
import cn.jk.study.spring.part1.spring2.service.UserService;

/**
 * Created by jiakang on 2018/8/16.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUserInfo() {
        userDao.getUserInfo();
    }
}
