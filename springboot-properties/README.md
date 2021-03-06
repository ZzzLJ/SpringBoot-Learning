#### Springboot-properties Structure
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─springproperties
    │  │          │  SpringPropertiesApplication.java
    │  │          │
    │  │          └─properties
    │  │                  MySelfProperty.java
    │  │                  UserProperty.java
    │  │
    │  └─resources
    │      │  application-dev.properties
    │      │  application-prod.properties
    │      │  application.properties
    │      │
    │      ├─static
    │      └─templates
    └─test
        ├─java
        │  └─com
        │      └─springproperties
        │          │  SpringPropertiesApplicationTests.java
        │          │
        │          └─properties
        │                  ValueProperty.java
        │
        └─resources
                application.yml


Spring Boot 不单单从 application.properties 获取配置，所以我们可以在程序中多种设置配置属性。按照以下列表的优先级排列：
1. 命令行参数
2. java:comp/env 里的 JNDI 属性
3. JVM 系统属性
4. 操作系统环境变量
5. RandomValuePropertySource 属性类生成的 random.* 属性
6. 应用以外的 application.properties（或 yml）文件
7. 打包在应用内的 application.properties（或 yml）文件
8. 在应用 @Configuration 配置类中，用 @PropertySource 注解声明的属性文件
9. SpringApplication.setDefaultProperties 声明的默认属性

可见，命令行参数优先级最高。这个可以根据这个优先级，可以在测试或生产环境中快速地修改配置参数值，而不需要重新打包和部署应用。
还有第 6 点，根据这个在多 moudle 的项目中，比如常见的项目分 api 、service、dao 等 moudles，往往会加一个 deploy moudle 去打包该业务各个子 moudle，应用以外的配置优先。

根据优先级，顺便介绍下 jar 运行的方式，通过设置 -Dspring.profiles.active=prod 去指定相应的配置:
mvn package
java -jar -Dspring.profiles.active=prod springboot-properties-0.0.1-SNAPSHOT.jar
    