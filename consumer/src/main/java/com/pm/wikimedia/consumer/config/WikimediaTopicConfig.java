package com.pm.wikimedia.consumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class WikimediaTopicConfig {

    public static final String WIKIMEDIA_STREAM_TOPIC = "wikimedia-stream";

    @Bean
    public NewTopic wikimediaStreamTopic() {
        return TopicBuilder
                .name(WIKIMEDIA_STREAM_TOPIC)
                .build();
    }
}
