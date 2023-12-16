package com.dpkProjects.SetRecordApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SetRecordAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetRecordAppApplication.class, args);
	}

}
