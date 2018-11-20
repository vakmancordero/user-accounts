package com.tecgurus.useraccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class UserAccountsApp {

	public static void main(String[] args) {
		SpringApplication.run(UserAccountsApp.class, args);
	}

}
