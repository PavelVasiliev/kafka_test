package tech.inno.kafka.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO {

    private long id;
    private String type; //ToDo enum
    private String content;
}
