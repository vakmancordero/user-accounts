package com.tecgurus.configclientapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigClientAppApplication {

	@Value("${some.field}")
    private String someFieldValue;

	@GetMapping()
	public ResponseEntity test() {
	    return ResponseEntity.ok(
	            String.format("Some field value is: %s", someFieldValue)
        );
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientAppApplication.class, args);
	}

}
