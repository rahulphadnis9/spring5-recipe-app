package com.recipe;

import org.apache.catalina.servlets.WebdavServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

@SpringBootApplication
public class RecipeApplication {

	public static void main(String[] args) {

		SpringApplication.run(RecipeApplication.class, args);


	}
}
