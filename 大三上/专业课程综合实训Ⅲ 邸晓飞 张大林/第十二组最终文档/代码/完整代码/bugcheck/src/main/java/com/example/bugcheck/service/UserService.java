package com.example.bugcheck.service;


import com.example.bugcheck.pojo.table.User;

import java.util.List;

public interface UserService {

    //注册成为用户
    User registerUser(User user);

    /*
     * 同样,登陆成功返回用户实体(包含从数据库中查到的所有字段),否则返回null
     * */
    User loginUser(String username, String password);

    List<User> listUser();

    int changeEmail(String username,String email);

    double changePassword(String username,String password);
}
