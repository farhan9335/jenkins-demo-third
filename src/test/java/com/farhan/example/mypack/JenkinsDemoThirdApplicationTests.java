package com.farhan.example.mypack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoThirdApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoThirdApplicationTests.class);
	
	
	@Test
	void contextLoads() {
		logger.info("<=======Started to execute contextLoads() method===============>");
		assertEquals(true, true);
		logger.info("<=======Successfully executed contextLoads() method===============>");
	}

}
