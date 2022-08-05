package com.project.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@ComponentScan({"com.project.example"})
public class Application {
    
    public static void main(String[] args) {
        
        SpringApplication.run(Application.class, args);

    }

}
