package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(GithubProperties.class)
@EnableCaching
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(DemoApplication.class, args);
		cac.registerShutdownHook();
	}

}

