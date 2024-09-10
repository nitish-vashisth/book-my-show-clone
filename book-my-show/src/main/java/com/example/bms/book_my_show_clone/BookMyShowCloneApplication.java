package com.example.bms.book_my_show_clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackageClasses = {controller.BmsController.class, bmscore.RequestManager.class})
public class BookMyShowCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowCloneApplication.class, args);
	}
}
