package com.codereview.openfeing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenfeingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenfeingApplication.class, args);
	}

}
