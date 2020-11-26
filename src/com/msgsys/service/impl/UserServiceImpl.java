package com.msgsys.service.impl;

import com.msgsys.dao.UserDao;
import com.msgsys.dao.impl.UserDaoImpl;
import com.msgsys.entity.User;
import com.msgsys.service.UserService;

/**
 * 作者: Fu YuHang
 * 日期: 2020/11/27 0:16
 * 描述:
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    //注册
    @Override
    public int register(User user) {
        return userDao.insert(user);
    }

    //登录
    @Override
    public User login(User user) {
        return userDao.queryUserByNameAndPassword(user);
    }
}
