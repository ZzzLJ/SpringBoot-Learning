package com.systemcommon.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ZzzLJ
 */
@Configuration
public class ActiveMQQueueConfig {
    @Bean
    public ActiveMQQueue queue(){
        return new ActiveMQQueue();
    }
}
