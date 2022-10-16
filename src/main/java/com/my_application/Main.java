package com.my_application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.my_application")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
