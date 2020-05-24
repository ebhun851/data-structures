package com.dstructures;

public class ReverseString {

	public static void main(String[] args) {

		String input = "eswar";
		int charLen = input.toCharArray().length;
		char[] inputchars = new char[charLen];

		for (int i = charLen - 1; i >= 0; i--) {
			inputchars[charLen - (i + 1)] = input.toCharArray()[i];
		}
		String result = new String(inputchars);
		System.out.println(result);

	}
}
