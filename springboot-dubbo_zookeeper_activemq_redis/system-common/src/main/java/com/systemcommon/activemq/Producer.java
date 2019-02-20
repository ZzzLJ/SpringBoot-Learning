package com.systemcommon.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import javax.jms.Destination;

//@Service("producer")
//@Component
public class Producer {  
    @Autowired 
    private JmsTemplate jmsTemplate;

    public void sendMessage(String QueName, String message) {
        Destination dest = new ActiveMQQueue(QueName);
        jmsTemplate.convertAndSend(dest, message);
    }  
}
