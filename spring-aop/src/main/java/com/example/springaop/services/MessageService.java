package com.example.springaop.services;


import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String getMessage(String param) {
        System.out.println("method: " + param);
        return param;
    }
}