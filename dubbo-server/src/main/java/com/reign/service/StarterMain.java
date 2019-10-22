package com.reign.service;

import org.apache.dubbo.container.Main;

/**
 * @ClassName: StarterMain
 * @Description: 启动
 * @Author: wuwx
 * @Date: 2019-10-22 13:41
 **/
public class StarterMain {
    public static void main(String[] args) {
        //Dubbo提供的启动类方法，它会启动dobbu中配置的多个container
        Main.main(new String[]{"spring","log4j"});
        //除了spring里面通过api的方式去加载springxml文件，还有其他方式？
    }
}
