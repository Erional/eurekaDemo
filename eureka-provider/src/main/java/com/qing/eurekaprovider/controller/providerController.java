package com.qing.eurekaprovider.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class providerController {

    @RequestMapping("/provider")
    public String getProvider(){
        return "provider123";
    }
}
