package com.srs.kafkatest.kafkapc;

import com.srs.kafkatest.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "srsTopicjson",groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("JSON Message USER received %s",user));
    }
}
