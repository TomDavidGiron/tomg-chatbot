package com.handson.chatbot.controller;

import com.handson.chatbot.service.ImdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bot")
public class BotController {

    @Autowired
    ImdbService ImdbService;

    @RequestMapping(value = "/imdb", method = RequestMethod.GET)
    public ResponseEntity<?> getProduct(@RequestParam String keyword)
    {
        return new ResponseEntity<>(ImdbService.searchProducts(keyword), HttpStatus.OK);
    }
}