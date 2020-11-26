package com.msgsys.dao.impl;

import com.msgsys.dao.BaseDao;
import com.msgsys.dao.UserDao;
import com.msgsys.entity.User;
import sun.misc.Perf;

import java.util.List;
import java.util.concurrent.DelayQueue;

/**
 * 作者: Fu YuHang
 * 日期: 2020/11/26 23:30
 * 描述:
 */
public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public int insert(User user) {
        String sql = "INSERT INTO `t_user` (`username`,`password`,`email`) VALUES (?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public int update(User user) {
        String sql = "UPDATE `t_user` SET `username` = ?,`password` = ?,`email` = ? WHERE `id` = ?";
        return update(sql, user.getUsername(), user.getPassword(), user.getEmail(), user.getId());
    }

    @Override
    public int delete(Integer id) {
        String sql = "DELETE FROM `t_user` WHERE id= ?";
        return update(sql, id);
    }

    @Override
    public List<User> queryAll() {
        String sql = "SELECT * FROM `t_user`";
        return queryForList(User.class,sql);
    }

    @Override
    public User queryUserById(Integer id) {
        String sql = "SELECT * FROM `t_user` WHERE `id` = "+id;
        return queryForOne(User.class, sql);
    }

    @Override
    public User queryUserByNameAndPassword(User user) {
        String sql = "SELECT * FROM `t_user` WHERE `username`= ? AND`password`= ?";
        return queryForOne(User.class, sql, user.getUsername(), user.getPassword());
    }

//    public static void main(String[] args) {
//        UserDaoImpl userDao = new UserDaoImpl();
//        int insert = userDao.insert(new User("1", "2", "3"));
//        System.out.println(insert);
//
//    }

}
