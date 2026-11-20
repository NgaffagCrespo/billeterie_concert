package com.tubuntu.ndolabale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan("com.tubuntu.ndolabale.entities")
public class NdolabaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(NdolabaleApplication.class, args);
	}

}
