package com.qing.eurekaconsumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class consumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public String getConsumer() {
        return restTemplate.getForObject("http://127.0.0.1:8763/provider", String.class);
//        return restTemplate.getForObject("http://eureka-provider/provider", String.class);
    }

    @RequestMapping("/test")
    public String getTest() {
        return "test";
    }

}
