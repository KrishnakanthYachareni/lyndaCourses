package com.epam.spring.basics.springinadvance.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.epam.spring.basics.springinadvance.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.epam.spring.basics.springinadvance.componentscan")
public class SpringInAdvanceComponentScanApplication {

	// What are the beans
	// What are the dependences of a bean.
	// Where to search for beans? ==> No need in spring boot application

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringInAdvanceScopeApplication.class, args);

		ComponentDAO personDAO = applicationContext.getBean(ComponentDAO.class);

	}
}
