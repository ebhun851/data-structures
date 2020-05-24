package com.dstructures;

import java.util.ArrayList;
import java.util.List;

public class Decompress {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 5, 6 };
		List<Integer> result = new ArrayList<Integer>();

		boolean allow = true;
		for (int a = 0; a <= nums.length - 1; a++) {
			if (allow) {
				for (int j = 1; j <= nums[a]; j++) {
					result.add(nums[a + 1]);
				}
				allow = false;
			} else {
				allow = true;
			}

		}
		int[] ret = new int[result.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = result.get(i).intValue();
		}
	}

	
}
