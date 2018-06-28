package com.levent.consultantapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan(basePackages = {"com.levent.consultantapi.model"} )
//@EnableJpaRepositories(basePackages = {	"com.levent.consultantapi.repository",
//										"com.levent.consultantapi.repository.impl"
//		})
public class EntryPoint {

	public static void main(String[] args) {
		SpringApplication.run(EntryPoint.class, args);
	}

}
