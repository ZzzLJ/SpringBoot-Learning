package com.systemcommon.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Subscribe {
	@KafkaListener(topics = {"test"})
    public void consumer(String message){
        System.out.println("test topic message:"+ message);
    }
}
