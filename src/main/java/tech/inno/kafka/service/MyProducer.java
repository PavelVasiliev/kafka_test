package tech.inno.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyProducer {
    public static final String TOPIC = "mytopic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publishToTopic(String msg) {
        System.out.println("publish topic " + TOPIC);
        this.kafkaTemplate.send(TOPIC, msg);
    }
}
