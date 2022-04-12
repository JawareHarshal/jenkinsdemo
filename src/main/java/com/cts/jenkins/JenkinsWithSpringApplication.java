package com.cts.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JenkinsWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsWithSpringApplication.class, args);
	}

}
