package com.examplecics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@ComponentScan(basePackages = {"br.com.viavarejo", "com.examplecics.demo"})
@CrossOrigin("*")
@SpringBootApplication
@EnableFeignClients(basePackages = "com.examplecics.demo.feign")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
