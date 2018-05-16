/**
 * 
 */
package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class BasicStream {

	public static void main(String[] args) {
		List<String> namnes = Arrays.asList("Krishna", "Kanth", "Yachareni", "Srikanth", "Sravanthi");

		// filter and forEach flow
		namnes.stream().filter((p) -> p.startsWith("S")).forEach((q) -> System.out.println(q));

		// filter and count
		long count = namnes.stream().filter((p) -> p.startsWith("S")).count();
		System.out.println(count);

		// Source -->Intermediate Operations -->Terminal Operations
		List<String> collectList = namnes.stream().filter((p) -> p.startsWith("S")).collect(Collectors.toList());
		System.out.println(collectList);

		// 1 to 100 sum
		int sum = IntStream.range(1, 101).sum();
		System.out.println(sum);
		
		// reduce example
		Integer arrSum = Stream.of(10,20,22,12,14).reduce(1000, Integer::sum);
        System.out.println(arrSum);
	}
}
