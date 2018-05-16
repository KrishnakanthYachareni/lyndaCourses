/**
 * 
 */
package com.java8.features;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class MethodReference {

	public static void main(String[] args) {
		/*
		 * Method reference is shorthand for lambda expression here we can also write
		 * lambda expression like ()->process()
		 */
		Thread thread = new Thread(MethodReference::process);
		thread.start();
	}

	private static void process() {
		System.out.println("This is a method reference example");
	}
}
