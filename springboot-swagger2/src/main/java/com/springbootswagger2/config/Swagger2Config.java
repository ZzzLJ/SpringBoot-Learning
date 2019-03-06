package com.springbootswagger2.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: ZzzLJ
 */
//@Configuration  Spring加载类配置
@Configuration
//@EnableSwagger2  启用Swagger2
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现
                .select()
                //swagger2 扫描包路径，Swagger会扫描该包下所有Controller定义的API，并产生文档内容（除了被@ApiIgnore指定的请求）
                .apis(RequestHandlerSelectors.basePackage("com.springbootswagger2.jms"))
                .build();
    }

    //构建API详细信息函数
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //页面标题
                .title("SpringBoot-Swagger2 构建RESTful APIs")
                //创建人
                .contact(new Contact("ZzzLJ","https://github.com/ZzzLJ","ZzzLJDec25th@gmail.com"))
                .version("1.0.0")
                .description("Swagger Description")
                .build();
    }

}
