package com.configserver.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RefreshScope
@RestController
public class ClientController {

    @Value("${saludo}")
    private String saludo;

    @PostConstruct
    public void postConstruct(){
        System.out.println("PROPERTY: "+saludo);

    }

    @GetMapping
    public String getMessage(){
        return saludo;
    }

}
