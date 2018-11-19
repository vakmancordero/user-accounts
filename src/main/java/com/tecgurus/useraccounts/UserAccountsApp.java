package com.tecgurus.useraccounts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class UserAccountsApp {

	@Value("${some.field}")
    private String someFieldValue;

	@GetMapping("/test")
	public ResponseEntity test() {
	    return ResponseEntity.ok(
	            String.format("Some field value is: %s", someFieldValue)
        );
	}

	public static void main(String[] args) {
		SpringApplication.run(UserAccountsApp.class, args);
	}

}
