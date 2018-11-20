package com.tecgurus.useraccounts.controller;

import org.springframework.http.ResponseEntity;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RefreshScope
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${some.field}")
    private String someField;

    @Value("${some.other-field}")
    private String someOtherField;
    
    @GetMapping("/clientProperties")
	public ResponseEntity test() {
	    return ResponseEntity.ok(
	            Arrays.asList(
                    String.format("Some field value is: %s", someField),
                    String.format("Some other field value is: %s", someOtherField)
                )
        );
	}



}