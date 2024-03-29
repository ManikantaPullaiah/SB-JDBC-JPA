package com.common.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class AlertRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Alert Runner's:alert application started");
	}

}
