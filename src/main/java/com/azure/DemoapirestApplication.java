package com.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoapirestApplication {

	@GetMapping("/mensaje")
	public String mensajeAzure() {
		return "MENSAJE API REST SPRING BOOT - AZURE";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoapirestApplication.class, args);
	}

}
