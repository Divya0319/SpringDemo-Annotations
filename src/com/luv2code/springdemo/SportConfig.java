package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//  @ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:logger.properties")
@PropertySource("classpath:sports.properties")
public class SportConfig {
	
	@Bean
	public MyLoggerConfig myLoggerConfig(
			@Value("${root.logger.level}")String rootLoggerLevel,
			@Value("${printed.logger.level}")String printedLoggerLevel) {
		MyLoggerConfig myloggerConfig = new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);
		
		return myloggerConfig;
		
	}
	
	// define bean for sad fortune service
	@Bean
	public SadFortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
