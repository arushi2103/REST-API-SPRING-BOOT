package com.learn.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.learn.restdemo.model")
@EntityScan("com.learn.restdemo.model")
@EnableJpaRepositories(basePackages = "com.learn.restdemo.model")



public class RestDemoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);

		System.out.println("Hiieeee!!!");

	}

}
