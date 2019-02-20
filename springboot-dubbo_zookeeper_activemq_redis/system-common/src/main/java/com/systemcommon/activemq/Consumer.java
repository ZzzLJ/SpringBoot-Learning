package com.systemcommon.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

//@Component
public class Consumer {
    //使用JmsListener配置消费者监听队列，其中msg是接收到的消息
    @JmsListener(destination = "FirstQueue")
    public void receiveFirstQueue(String msg) {
        System.out.println("FirstQueue:" + msg);
    }

    @JmsListener(destination = "SecondQueue")
    public void receiveSecondQueue(String msg) {
        System.out.println("SecondQueue:" + msg);
    }
}