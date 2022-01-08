package com.jenkins.demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class JenkinsRestApplicationTests {

	public  Logger logger = LoggerFactory.getLogger(JenkinsRestApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("-----------In Test case execution ----");
		
		assertEquals(true, true);
	}

}
