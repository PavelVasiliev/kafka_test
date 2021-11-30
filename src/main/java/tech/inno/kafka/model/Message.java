package tech.inno.kafka.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import tech.inno.kafka.model.dto.MessageDTO;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Message {

    private static long id = 0;
    private String type; //ToDo enum MessageType
    private String content;
    private LocalDateTime timeCreated;

    public Message(String type, String content) {
        id++; //FixMe
        this.type = type;
        this.content = content;
        timeCreated = LocalDateTime.now();
    }

    public MessageDTO toDto() {
        return new MessageDTO(
                id, type, content
        );
    }
}
