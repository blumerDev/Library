package com.example.Library.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ping {

    String pong(){
        return "pong";
    }
}
