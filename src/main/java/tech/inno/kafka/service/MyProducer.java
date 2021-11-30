package tech.inno.kafka.service;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import tech.inno.kafka.model.Message;
import tech.inno.kafka.model.AvroJSON;

@Service
@Log4j2
public class MyProducer {

    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public MyProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publish(Message msg) {
        log.log(Level.INFO, "published type: " + msg.getType());
        this.kafkaTemplate.send(msg.getType(), new AvroJSON(msg.toDto()).sendAvro());
    }
}
