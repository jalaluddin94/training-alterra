package com.epemilu.government;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class GovernmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(GovernmentApplication.class, args);
	}

}
