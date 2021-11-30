package tech.inno.kafka.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.inno.kafka.model.Message;
import tech.inno.kafka.service.MyProducer;

@RestController
@RequestMapping("/kafka")
@Log4j2
public class KafkaController {

    private MyProducer producer;

    @Autowired
    public KafkaController(MyProducer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/send")
    public void sendMsg(@RequestBody Message msg){
        log.log(Level.INFO,"sendMsg() :: topic :: " + msg.getType());
        producer.publish(msg);
    }
}
