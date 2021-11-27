package tech.inno.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@ComponentScan(basePackages = "tech.inno.kafka.config")

@ComponentScan(basePackages = {
        "tech.inno.kafka.controller",
        "tech.inno.kafka.service",
})
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

}
