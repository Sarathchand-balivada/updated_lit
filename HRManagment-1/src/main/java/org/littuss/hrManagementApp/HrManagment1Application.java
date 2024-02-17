package org.littuss.hrManagementApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EntityScan(basePackages = "your.package.with.entities")
@ComponentScan(basePackages = {"org.littuss.hrManagementApp"})
public class HrManagment1Application {

	public static void main(String[] args) {
		SpringApplication.run(HrManagment1Application.class, args);
	}

}
