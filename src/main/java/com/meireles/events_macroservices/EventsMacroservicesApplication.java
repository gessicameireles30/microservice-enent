package com.meireles.events_macroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EventsMacroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventsMacroservicesApplication.class, args);
	}

}
