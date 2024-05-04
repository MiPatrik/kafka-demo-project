package com.pm.wikimedia.producer.controller;

import com.pm.wikimedia.producer.consumer.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wikimedia")
@RequiredArgsConstructor
public class WikimediaController {

    private final WikimediaStreamConsumer consumer;

    @GetMapping
    public void startPublishing() {
        consumer.consumeStreamAndPublish();
    }

}
