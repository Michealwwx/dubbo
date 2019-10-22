package com.reign;

import com.reign.interfaces.ILoginService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: App
 * @Description: app
 * @Author: wuwx
 * @Date: 2019-10-22 10:27
 **/
public class App {
    public static void main(String[] args) {
        //dubbo://192.168.13.1:20880/com.gupaoedu.dubbo.IPayService
        //http://192.165...
        ClassPathXmlApplicationContext classPathXmlApplicationContext=
                new ClassPathXmlApplicationContext(new String[]{"application.xml"});

        ILoginService loginService=(ILoginService) classPathXmlApplicationContext.
                getBean("loginService");

        String rs=loginService.login("Test"); //pay方法一定是远程调用
        System.out.println(rs);
    }
}
