package com.example.bms.book_my_show_clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = controller.BmsController.class)
public class BookMyShowCloneApplication {

	public static void main(String[] args) {


		SpringApplication.run(BookMyShowCloneApplication.class, args);


	}

}
