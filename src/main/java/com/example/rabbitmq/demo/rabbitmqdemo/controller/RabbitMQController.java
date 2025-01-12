package com.example.rabbitmq.demo.rabbitmqdemo.controller;

import com.example.rabbitmq.demo.rabbitmqdemo.service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQController {
    @Autowired
    private RabbitMQService rabbitMQService;

    @GetMapping(value= "/send")
    public String sendMessage(){
        rabbitMQService.sendMessage("this is from controller");
        return "sent";
    }
}
