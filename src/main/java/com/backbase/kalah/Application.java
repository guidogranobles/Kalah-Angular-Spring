package com.backbase.kalah;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.backbase.coding.challenge.services",  "com.backbase.coding.challenge.business"})
@EnableJpaRepositories("com.backbase.coding.challenge.dao") 
@EntityScan("com.backbase.coding.challenge.entities")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}