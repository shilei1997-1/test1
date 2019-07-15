package com.ssm.service;

import com.ssm.pojo.User;

import java.util.List;

public interface UserService {
    User login(String username, String password);

    List<User> queryUsers(String username);

    boolean addUser(User user);
}
