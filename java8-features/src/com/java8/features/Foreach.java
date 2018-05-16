/**
 * 
 */
package com.java8.features;

import java.util.Arrays;
import java.util.List;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class Foreach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Krishna", "Kanth", "Yachareni", "Srikanth", "Sravanthi");
		list.forEach((name) -> System.out.println(name));
	}

}
