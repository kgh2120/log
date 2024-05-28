package com.kk.log;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.RollingPolicy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {


	@GetMapping("/")
	public ResponseEntity<String> hello(){
		log.trace("Hello I'm {} Log", "trace");
		log.debug("Hello I'm {} Log", "debug");
		log.info("Hello I'm {} Log", "info");
		log.warn("Hello I'm {} Log", "warn");
		log.error("Hello I'm {} Log", "error");

		return ResponseEntity.ok("HELLO");
	}
}
