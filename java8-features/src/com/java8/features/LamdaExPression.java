package com.java8.features;

public class LamdaExPression {
	public static void main(String[] args) {
		MyInterface addTwo = (int a, int b) -> a + b;
		System.out.println(addTwo.add(10, 20));
	}
}

@FunctionalInterface
interface MyInterface {
	int add(int a, int b);
}