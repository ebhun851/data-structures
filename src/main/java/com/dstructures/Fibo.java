package com.dstructures;

public class Fibo {

	public static void main(String[] args) {

		int input1 = 0;
		int input2 = 1;

		System.out.println(input1);
		System.out.println(input2);
		for (int i = 0; i < 10; i++) {

			int result = input1 + input2;
			System.out.println(result);

//			input1 = input2;
//			input2 = result;

		}

	}

	static void fibo(int num1, int num2) {
		
		System.out.println(num1+num2);
	}
}

//0 1 1 2 3 5 8 13 21 34