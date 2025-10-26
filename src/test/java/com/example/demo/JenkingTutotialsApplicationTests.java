package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkingTutotialsApplicationTests {
	
	public static Logger log = LoggerFactory.getLogger(JenkingTutotialsApplicationTests.class);
	

	@Test
	void contextLoads() {
		log.info("Test cases are executing...");
		assertEquals(true, true);
	}

}
