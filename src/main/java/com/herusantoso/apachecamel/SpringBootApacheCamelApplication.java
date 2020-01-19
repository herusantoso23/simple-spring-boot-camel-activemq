package com.herusantoso.apachecamel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class SpringBootApacheCamelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApacheCamelApplication.class, args);
	}

}
