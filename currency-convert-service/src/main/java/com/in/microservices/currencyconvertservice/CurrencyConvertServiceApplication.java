package com.in.microservices.currencyconvertservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignCients("com.in.microservices.currencyconvertservice")
public class CurrencyConvertServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConvertServiceApplication.class, args);
	}

}
