package com.pm.wikimedia.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.pm.wikimedia.consumer.config.WikimediaTopicConfig.WIKIMEDIA_STREAM_TOPIC;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = WIKIMEDIA_STREAM_TOPIC, groupId = "testGroup")
    public void consume(String message) {
        log.info("Consumed message from wikimedia-stream: {}", message);
        // Tady jakymkoliv zpusobem zpracovat data
    }
}
