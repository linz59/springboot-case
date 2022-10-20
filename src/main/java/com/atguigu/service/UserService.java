package com.atguigu.service;

import com.atguigu.pojo.User;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * @title
 * @ClassName UserService
 * @Date 2022/10/20 10:54
 */


public interface UserService {
    List<User> findAll();

    User findById(Integer id);

    void insert(User user);

    void update(User user);

    void delete(Integer id);
}
