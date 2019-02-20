package com.systemconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.systemcommon.activemq.Producer;
import com.systemcommon.redis.RedisService;
import com.systemprovider.service.TestService;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.jms.Destination;

/**
 * @Author: ZzzLJ
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Reference
    private TestService testService;

    @RequestMapping("/queue")
    public String queue() {
        return testService.queue();
    }

    @RequestMapping("/topic")
    public String topic() {
        return testService.topic();
    }

    @RequestMapping("/redis")
    public String redis(){
        return testService.redis();
    }


}
