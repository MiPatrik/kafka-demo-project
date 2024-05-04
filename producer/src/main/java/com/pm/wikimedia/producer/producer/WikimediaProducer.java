package com.pm.wikimedia.producer.producer;

import com.pm.wikimedia.producer.config.WikimediaTopicConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WikimediaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
        log.info("Send message to topic wikimedia-stream : {}", message);
        kafkaTemplate.send(WikimediaTopicConfig.WIKIMEDIA_STREAM_TOPIC, message);
    }
}
