package com.systemcommon.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ZzzLJ
 */
@Configuration
public class ActiveMQTopicConfig {
    @Bean
    public ActiveMQTopic topic(){
        return new ActiveMQTopic();
    }
}
