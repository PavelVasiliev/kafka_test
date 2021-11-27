package tech.inno.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.inno.kafka.service.MyProducer;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private MyProducer producer;

    @PostMapping(value = "/send")
    public void sendMsg(@RequestParam("msg") String msg){
        producer.publishToTopic(msg);
    }
}
