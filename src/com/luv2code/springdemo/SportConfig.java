package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:logger.properties")
public class SportConfig {
	
	@Bean
	public MyLoggerConfig myLoggerConfig(
			@Value("${root.logger.level}")String rootLoggerLevel,
			@Value("${printed.logger.level}")String printedLoggerLevel) {
		MyLoggerConfig myloggerConfig = new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);
		
		return myloggerConfig;
		
	}

}
