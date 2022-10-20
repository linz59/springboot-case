package com.atguigu.controller;

import com.atguigu.dao.UserDao;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @title
 * @ClassName UserDao
 * @Date 2022/10/20 10:51
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public Result list() {
        List<User> userList = userService.findAll();
        return Result.ok(userList);
    }

}
