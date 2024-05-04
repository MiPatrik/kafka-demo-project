package com.pm.kafkaproject.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
        log.info("Send message to topic firstTopic : {}", message);
        kafkaTemplate.send("firstTopic", message);
    }
}
