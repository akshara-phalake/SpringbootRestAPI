package com.example.helloworldspringapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldSpringApplication.class, args);
        System.out.println("Akshara");
    }
}
