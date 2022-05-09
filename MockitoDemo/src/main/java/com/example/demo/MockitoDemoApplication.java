package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.HomeController;


@ComponentScan("com.example.*")
@SpringBootApplication
public class MockitoDemoApplication implements CommandLineRunner{
	
	@Autowired
	private HomeController homeController;

	public static void main(String[] args) {
		SpringApplication.run(MockitoDemoApplication.class, args);
		
	}

	 @Override
	    public void run(String args[]) throws Exception 
	    {

	        // Print statement when method is called
//		 System.out.println(homeController);
//	        System.out.println("HEllo world");
	    }
}
