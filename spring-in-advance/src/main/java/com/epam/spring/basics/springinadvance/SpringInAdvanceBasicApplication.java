package com.epam.spring.basics.springinadvance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.epam.spring.basics.springinadvance.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringInAdvanceBasicApplication {

	// What are the beans
	// What are the dependences of a bean.
	// Where to search for beans? ==> No need in spring boot application

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringInAdvanceBasicApplication.class, args);

		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl2 = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearchImpl.binarySearch(new int[] { 1, 4, 3, 2 }, 4);

		System.out.println(binarySearchImpl);
		System.out.println(binarySearchImpl2);
                                             
		System.out.println(result);
	}
}
