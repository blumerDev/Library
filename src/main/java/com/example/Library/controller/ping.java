package com.example.Library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ping {

    @GetMapping("/ping")
    String pong(){

        return "pong";
    }
}
