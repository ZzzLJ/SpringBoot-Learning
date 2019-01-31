package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot应用的标识
@SpringBootApplication
public class SpringbootApplication {
	// 程序启动入口
	// 启动嵌入式的Tomcat并初始化Spring环境及其各Spring组件
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
