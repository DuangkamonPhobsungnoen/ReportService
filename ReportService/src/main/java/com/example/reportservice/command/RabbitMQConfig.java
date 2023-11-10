package com.example.reportservice.command;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue reportQueue() {
        return new Queue("reportQueue");
    }
}