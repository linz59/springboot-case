package com.atguigu.test;

import com.atguigu.dao.UserDao;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @title
 * @ClassName TestUser
 * @Date 2022/10/20 10:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUser {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;


    @Test
    public void testU() {
        List<User> users = userDao.selectAll();
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void testService() {
        User user = new User();
        user.setUsername("lin2022");
        user.setName("zlin");
        user.setAge(23);
        userService.insert(user);
    }


}
