package com.LJ.StockSafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class StockSafeSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockSafeSpringApplication.class, args);
	}

}
