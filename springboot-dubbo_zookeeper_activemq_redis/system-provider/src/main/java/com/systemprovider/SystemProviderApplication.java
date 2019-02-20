package com.systemprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableDubbo
public class SystemProviderApplication {
    //Web应用运行
	/*public static void main(String[] args) {
		SpringApplication.run(SystemProviderApplication.class, args);
	}*/

	//Dubbo服务提供者Provider   非Web应用运行
    public static void main(String[] args) {
        new SpringApplicationBuilder(SystemProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}

