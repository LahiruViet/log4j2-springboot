package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		log.error("Error log");
		log.warn("Warn log");
		log.info("Info log");
		log.debug("Debug log");
		log.trace("Trace log");

	}

}
