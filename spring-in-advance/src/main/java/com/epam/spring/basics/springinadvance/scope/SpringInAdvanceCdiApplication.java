package com.epam.spring.basics.springinadvance.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.epam.spring.basics.springinadvance.cdi.SomeCdiBussiness;

@SpringBootApplication
@ComponentScan("com.epam.spring.basics.springinadvance.cdi")
public class SpringInAdvanceCdiApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringInAdvanceCdiApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringInAdvanceCdiApplication.class, args);

		SomeCdiBussiness someCdiBussiness = applicationContext.getBean(SomeCdiBussiness.class);
		logger.info("{} - dao {}", someCdiBussiness, someCdiBussiness.getSomeCDIDAO());

	}
}
