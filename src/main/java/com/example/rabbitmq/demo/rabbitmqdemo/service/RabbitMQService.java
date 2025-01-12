package com.example.rabbitmq.demo.rabbitmqdemo.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    private static final String EXCHANGE_NAME = "topic_exchange";
    private static final String ROUTING_KEY = "hello_key";

    public void sendMessage(String message) {
         amqpTemplate.convertAndSend(EXCHANGE_NAME, ROUTING_KEY, message);
        System.out.println("Sent message: " + message);
    }

    @RabbitListener(queues = "hello")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
