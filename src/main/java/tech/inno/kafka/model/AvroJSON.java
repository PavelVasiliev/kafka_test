package tech.inno.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import tech.inno.kafka.model.dto.MessageDTO;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvroJSON { //FixMe removed with Avro
    private String type = "record";
    private String name = "MessageDTO";
    private MessageDTO msgDto;

    public AvroJSON(MessageDTO msgDto) {
        this.msgDto = msgDto;
    }

    //FixMe if i'm not right
    public String sendAvro(){
        return "{" +
                    "\"type\": \"record\"," +
                    "\"name\": \"MessageDTO\"," +
                    "\"aliases\": [\"msg\"]," +
                    "\"fields\" : [" +
                        "{\"name\": \"id\", \"type\": \"integer\", \"value\": " + msgDto.getId() + "}," +
                        "{\"name\": \"type\", \"type\": \"string\", \"value\": " + msgDto.getType() + "}," +
                        "{\"name\": \"content\", \"type\": \"string\", \"value\": " + msgDto.getContent() + "}" +
                "}"
        ;
    }
}
