package com.ssm.mapper;

import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User queryUserByNameAndPwd(@Param("username") String username,@Param("password") String password);

    List<User> selectUsers(@Param("uname") String username);

    boolean addUser(User user);
}
