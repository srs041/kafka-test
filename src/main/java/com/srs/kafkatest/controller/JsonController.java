package com.srs.kafkatest.controller;

import com.srs.kafkatest.entity.User;
import com.srs.kafkatest.kafkapc.JsonKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonController {

    private JsonKafkaProducer jsonKafkaProducer;

    @Autowired
    public JsonController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        jsonKafkaProducer.sendMessage(user);
        return  ResponseEntity.ok("JSON Message sent to the topic");
    }


}
