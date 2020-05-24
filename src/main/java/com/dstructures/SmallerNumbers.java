package com.dstructures;

public class SmallerNumbers {

	public static void main(String[] args) {
		int nums[] = { 7, 7, 7, 7 };
		int res[] = new int[nums.length];

		int i = 0;
		while (i < nums.length) {
			int counter = 0;
			int searchNum = nums[i];
			int j = 0;
			while (j < nums.length) {
				if (searchNum > nums[j]) {
					counter++;
				}
				j++;
			}
			res[i] = counter;
			i++;
		}
	}

}
