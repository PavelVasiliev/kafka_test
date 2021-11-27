package tech.inno.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MyConsumer {

    @KafkaListener(topics = "mytopic", groupId = "consumers")
    public void consumeFromTopic(String msg){
        System.out.println("consumed msg " + msg);
    }
}
