/**
 * 
 */
package com.epam.spring.basics.springinadvance.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Krishnakanth_Yachare
 *
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearch) {

		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(numbers);

		// Implement binary search Implementation here
		return 3;
	}

}
