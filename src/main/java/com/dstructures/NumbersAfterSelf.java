package com.dstructures;

import java.util.ArrayList;
import java.util.List;

public class NumbersAfterSelf {

	public static void main(String[] args) {

		int nums[] = { 5, 2, 1, 6 };

		int i = 0;

		List<Integer> result = new ArrayList<Integer>();

		while (i < nums.length) {

			int searchNum = nums[i];
			int j = i + 1;
			int counter = 0;
			while (j < nums.length) {
				if (searchNum > nums[j]) {
					counter++;
				}
				j++;
			}
			result.add(counter);
			i++;
		}
		
		System.out.println(result);
	}

}
