package com.example.rabbitmq.demo.rabbitmqdemo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String QUEUE_NAME = "hello";
    public static final String EXCHANGE_NAME = "topic_exchange";
    public static final String ROUTING_KEY = "hello_key";

    @Bean
    public Queue helloQueue() {
        return new Queue(QUEUE_NAME, false);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    public Binding binding(Queue helloQueue, TopicExchange exchange) {
        return BindingBuilder.bind(helloQueue)
                .to(exchange)
                .with(ROUTING_KEY);
    }
}
