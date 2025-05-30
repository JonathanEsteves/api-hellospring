package com.jonathan.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {


    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
        System.out.println("API rodando com H2 Database com sucesso!");
    }
}