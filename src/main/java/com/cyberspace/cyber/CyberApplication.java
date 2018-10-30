package com.cyberspace.cyber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class CyberApplication {

    public static void main(String[] args) {
        SpringApplication.run(CyberApplication.class, args);
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String test() {
        return "index";
    }
}
