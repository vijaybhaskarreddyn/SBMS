package com.vijay;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class Application implements ApplicationRunner, CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	@Order(value = 1)
	ApplicationRunner appRunner() {
		return args -> System.out.println("1) App Runner by using @Bean ");
	}

	@Bean
	CommandLineRunner cmdRunner() {
		return args -> System.out.println("2) CommandLineRunner by using @Bean");
	}

	@Override
	@Order(value = 2)
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("*******Start Class AppRunner -> Run method ******");

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("*******Start Class CommandLineRunner -> Run method ******");

	}

}
