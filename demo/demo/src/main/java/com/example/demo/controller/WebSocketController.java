package com.example.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import com.example.demo.model.Greeting;

@Controller
public class WebSocketController {

    @MessageMapping("/hello") // Defines the endpoint for receiving messages
    @SendTo("/topic/greetings") // Sends the response to the specified destination

    public Greeting greeting(String name) {
        return new Greeting("Hello, " + name + "!");
    }
}