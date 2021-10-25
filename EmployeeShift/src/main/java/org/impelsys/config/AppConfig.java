package org.impelsys.config;

import org.impelsys.model.DayShift;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("org.impelsys.model.impl")
public class AppConfig {
	//factory methods
	
	@Bean
	public DayShift createSamsungPhone() {
		return new DayShift();
	}
	
	@Bean
	public NightShift quadraCoreProcessor() {
		return new NightShift();
	
	}
	@Bean
	public Processor octaCoreProcessor() {
		return new OctaCoreProcessor();
	
	}

}
