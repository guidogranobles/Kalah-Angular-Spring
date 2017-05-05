package com.backbase.kalah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.backbase.coding.challenge.services",  "com.backbase.coding.challenge.business"})
@EnableJpaRepositories("com.backbase.coding.challenge.dao") 
@EntityScan("com.backbase.coding.challenge.entities")
public class KalahGameWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(KalahGameWebApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(KalahGameWebApplication.class, args);
	}

}