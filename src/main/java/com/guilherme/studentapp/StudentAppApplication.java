package com.guilherme.studentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity(prePostEnabled = true)
public class StudentAppApplication {

	public static void main(String[] args) {

		/* BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String password1 = bCryptPasswordEncoder.encode("john123");
		String password2 = bCryptPasswordEncoder.encode("sachin123"); */

		SpringApplication.run(StudentAppApplication.class, args);
	}

}
