package com.manahan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
@ComponentScan(basePackages = "com.manahan")
@EnableAutoConfiguration
@Configuration
@RestController
public class main {
    public static void main(String[] args) {
        SpringApplication.run(main.class, args);
    }
    @GetMapping("/greet")
    public String greet(){
        return "hello";
    }
}
