package com.handson.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ImdbService {

    public String searchProducts(String keyword) {
        return "Searched for:" + keyword;
    }
}