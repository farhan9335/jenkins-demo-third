package com.farhan.example.mypack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoThirdApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoThirdApplication.class);

	public static void main(String[] args) {
		logger.info("<=======Started to execute main method===========>");
		SpringApplication.run(JenkinsDemoThirdApplication.class, args);
		logger.info("<=======main method executed successfully===========>");
	}

	@PostConstruct
	public void initialization() {
		logger.info("<===========In initialization method=============>");
	}

}
