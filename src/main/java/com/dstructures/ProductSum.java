package com.dstructures;

public class ProductSum {

	public static void main(String[] args) {

		int n = 4421;
		int div = 0;

		int product = 1;
		int sum = 0;
		int result = 0;

		while (n > 0) {

			div = n % 10;
			product = product * div;
			sum = sum + div;
			n = n/10;

		}
		
		result = product - sum;
		System.out.println(result);
//		return result;
	}
}
