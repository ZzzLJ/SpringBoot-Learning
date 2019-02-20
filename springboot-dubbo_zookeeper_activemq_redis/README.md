#### springboot-dubbo_zookeeper_activemq_redis Structure
##### pom.xml
    springboot版本 2.1.1.RELEASE整合Dubbo、ActiveMQ、Redis
    <dependency>
        <groupId>com.alibaba.boot</groupId>
        <artifactId>dubbo-spring-boot-starter</artifactId>
        <version>0.2.0</version>
    </dependency>
##### system-provider
    ├─java
    │  └─com
    │      └─systemprovider
    │          │  SystemProviderApplication.java    @EnableDubbo 开启Dubbo服务
    │          │
    │          └─service
    │              │  RedisService.java             Redis
    │              │  TestService.java              @Service：import com.alibaba.dubbo.config.annotation.Service;
    │              │
    │              └─impl
    │                      TestServiceImpl.java
    │
    └─resources
            application.yml                         Dubbo服务提供者配置
##### system-consumer
    ├─java
    │  └─com
    │      └─systemconsumer
    │          │  SystemConsumerApplication.java
    │          │
    │          ├─controller
    │          │      TestController.java
    │          │
    │          └─jms
    │                  Consumer.java              ActiveMQ
    │
    └─resources
            application.yml                        Dubbo服务消费者配置 