package com.levent.consultantapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.levent.consultantapi.service.InfoService;
import com.levent.consultantapi.service.info.impl.InfoServiceImpl1;
import com.levent.consultantapi.service.info.impl.InfoServiceImpl2;
import com.levent.consultantapi.service.info.impl.InfoServiceImpl3;
import com.levent.consultantapi.service.info.impl.InfoServiceImpl4;

@Configuration
//@PropertySource(value = "classpath:implementation.properties")		// Use his when file is in classpath, ex: main/src/resources
@PropertySource("file:./config/implementation.properties")
public class AppConfig {
	
	@Value("${greeter.implementation}")
	String impl;
	
	@Bean
	public InfoService getImplementationFromPropertiesFile() {
		System.out.println("Implementation: " + impl);
		
		switch(impl) {
			case "impl1": {
				return new InfoServiceImpl1();
			}
			
			case "impl2": {
				return new InfoServiceImpl2();
			}
			
			case "impl3": {
				return new InfoServiceImpl3();
			}
			
			case "impl4": {
				return new InfoServiceImpl4();
			}
			
			default: {
				throw new IllegalStateException("No such implementation: " + impl);
			}
		}
	}

}
