package com.systemprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.systemprovider.service.RedisService;
import com.systemprovider.service.TestService;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import javax.jms.Destination;

/**
 * @Author: ZzzLJ
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${secondQueue}")
    private String secondQueue;

    @Value("${topicName}")
    private String topicName;

    @Autowired
    private RedisService redisService;

    @Override
    public String queue() {
        Destination destination = new ActiveMQQueue(secondQueue);
        for (int i = 0; i < 5; i++) {
            jmsTemplate.convertAndSend(destination, "firstQueueMessage" + i);
        }
        return "Queue SUCCESS";
    }

    @Override
    public String topic() {
        Destination destination = new ActiveMQTopic(topicName);
        for (int i = 0; i < 5; i++) {
            jmsTemplate.convertAndSend(destination, "TopicMessage" + i);
        }
        return "Topic SUCCESS";
    }

    @Override
    public String redis(){
        redisService.set("redisKey", "redisValue");
        return "RedisService SUCCESS";
    }
}
