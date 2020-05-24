package com.dstructures;

public class HeapStones {

	public static void main(String[] args) {

		int n = 4;

		System.out.println("Can you be the winner : "+checkWinner(n));

	}

	public static boolean checkWinner(int n) {

		if (n % 4 == 0)
			return false;
		else
			return true;
	}

}
