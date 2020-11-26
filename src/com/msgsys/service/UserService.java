package com.msgsys.service;

import com.msgsys.entity.User;

/**
 * 作者: Fu YuHang
 * 日期: 2020/11/27 0:13
 * 描述:
 */
public interface UserService {

    public int register(User user);

    User login(User user);
}
