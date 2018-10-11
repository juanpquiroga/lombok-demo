package co.com.rockthorum.lombokdemo.dto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggerDemo {
	public static void helloLog() {
		log.trace("Log trace");
		log.info("Log info");
		log.debug("Log debug");
		log.warn("Log warn");
		log.error("Log error");
	}
}
