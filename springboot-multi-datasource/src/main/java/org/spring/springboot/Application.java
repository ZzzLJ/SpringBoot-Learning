package org.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的Tomcat并初始化Spring环境及其各Spring 组件
        SpringApplication.run(Application.class,args);
    }
}
