package com.dstructures;

public class HammingDistance {

	public static void main(String[] args) {

		String s1 = "1001001";
		String s2 = "1011101";
		int hammingDistance = 0;

		for (int i = 0; i < s1.toCharArray().length; i++) {
			if (s1.toCharArray()[i] != s2.toCharArray()[i]) {
				hammingDistance++;
			}
		}
		System.out.println("Hamming distance is : " + hammingDistance);

	}

}
