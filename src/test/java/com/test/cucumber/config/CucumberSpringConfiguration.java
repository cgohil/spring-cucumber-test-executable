package com.test.cucumber.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;

@CucumberContextConfiguration
@SpringBootTest(classes = TestConfig.class)
@EmbeddedKafka(topics = {"booking-notification-topic", "transaction-notification-topic"})
public class CucumberSpringConfiguration {
}
