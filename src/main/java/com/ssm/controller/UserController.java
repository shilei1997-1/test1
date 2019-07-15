package com.ssm.controller;

import com.ssm.pojo.ResultVo;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;

    /**
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Object login(String username,String password){
        //调用service层
       User user= userService.login(username,password);
        //返回
        if(user!=null){//登陆成功
                user.setPassword("");
            return ResultVo.success(user);

        }else{//登录失败

            return ResultVo.error();
        }

    }

    /**
     * 显示用户列表
     * @param userAccount
     * @return
     */
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public  Object queryAUsers(String userAccount){
        System.out.println("------------------->"+userAccount);
       List<User> list= userService.queryUsers(userAccount);
        return list;
    }

    @RequestMapping(value = "/user/add",method = RequestMethod.POST)
    public  Object userAdd(User user){
        System.out.println("------------------->"+user);
        boolean f= userService.addUser(user);
       if(f){

           return ResultVo.success();
       }else{
           return ResultVo.error("添加失败");
       }

    }
}
