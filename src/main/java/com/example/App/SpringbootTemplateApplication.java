package com.example.App;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class SpringbootTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTemplateApplication.class, args);
    }

    @RequestMapping("/start")
    public String start() {
        log.info("ask start");
        return "receive start message";
    }

    @RequestMapping("/change")
    public String change() {
        log.info("ask change");
        return "receive start message";
    }

    @RequestMapping("/hehe")
    public String hehe() {
        log.info("ask hehe");
        return "receive start message";
    }

}
