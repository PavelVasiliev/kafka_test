package tech.inno.kafka.service;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class MyConsumer {

    @KafkaListener(topics = "sms", groupId = "consumers")
    public void consumeSMS(String msg){
        log.log(Level.INFO, "consumed sms:\n" + msg);
    }

    @KafkaListener(topics = "email", groupId = "consumers")
    public void consumeEmail(String msg){
        log.log(Level.INFO, "consumed email:\n" + msg);
    }

    @KafkaListener(topics = "tweet", groupId = "consumers")
    public void consumeTweet(String msg){
        log.log(Level.INFO, "consumed tweet:\n" + msg);
    }
}