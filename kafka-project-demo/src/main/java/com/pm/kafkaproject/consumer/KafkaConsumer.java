package com.pm.kafkaproject.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.pm.kafkaproject.payload.Student;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "firstTopic", groupId = "testGroup")
//    public void consume(String message) {
//        log.info("Consumed message from firstTopic: {}", message);
//    }

    @KafkaListener(topics = "firstTopic", groupId = "testGroup")
    public void consumeJson(Student student) {
        log.info("Consumed message from firstTopic: {}", student.toString());
    }
}
