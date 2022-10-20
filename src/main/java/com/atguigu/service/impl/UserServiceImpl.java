package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @title
 * @ClassName UserServiceImpl
 * @Date 2022/10/20 10:54
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.selectAll();
    }

    @Override
    public User findById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public void update(User user) {
        userDao.updateByPrimaryKey(user);
    }

    @Override
    public void delete(Integer id) {
        userDao.deleteByPrimaryKey(id);
    }

}
