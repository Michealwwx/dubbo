package com.reign.service;

import com.reign.interfaces.ILoginService;

/**
 * @ClassName: LoginService
 * @Description: 登录
 * @Author: wuwx
 * @Date: 2019-10-22 13:26
 **/
public class LoginService implements ILoginService {
    public String login(String s) {
        System.out.println("登录成功");
        return "hello world,dubbo";
    }
}
