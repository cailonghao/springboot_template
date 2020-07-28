package com.example.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTemplateApplication.class, args);
    }

    @RequestMapping("/start")
    public String start(){
        return "receive start message";
    }

    @RequestMapping("/change")
    public String change(){
        return "receive start message";
    }

    @RequestMapping("/hehe")
    public String hehe(){
        return "receive start message";
    }

}
