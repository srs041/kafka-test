package com.srs.kafkatest.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {

    @Bean
    public NewTopic srsTopic(){
        return TopicBuilder.name("srsTopic")
                .build();
    }

    @Bean
    public NewTopic srsTopicjson(){
        return TopicBuilder.name("srsTopicjson")
                .build();
    }

    //added as part of master1
    @Bean
    public NewTopic srsTopicjson2(){
        return TopicBuilder.name("srsTopicjson2")
                .build();
    }
}
