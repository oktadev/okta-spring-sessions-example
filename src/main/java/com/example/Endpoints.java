package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoints {

    @GetMapping("/")
    String serverInfo(@Value("${server.port}") int port) {
        return "Hello, your server port is: " + port;
    }
}