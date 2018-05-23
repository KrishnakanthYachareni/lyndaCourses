/**
 * 
 */
package com.epam.spring.basics.springinadvance.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Krishnakanth_Yachare
 *
 */
@Component
@Primary // for one implementation if two solutions are possible then use primary for one
			// bean else you will get an error.
public class QuickSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {

		// Write the logic for Quick sort.
		return numbers;
	}
}
