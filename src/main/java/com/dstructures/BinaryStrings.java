package com.dstructures;
// IMPORTANT: Multiple classes and nested static classes are supported 

//  uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class BinaryStrings {
	public static void main(String args[]) throws Exception {
		/*
		 * Sample code to perform I/O: Use either of these methods for input
		 * 
		 * //BufferedReader BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); String name = br.readLine(); // Reading input
		 * from STDIN System.out.println("Hi, " + name + "."); // Writing output to
		 * STDOUT
		 * 
		 * //Scanner
		 * 
		 * String name = s.nextLine(); // Reading input from STDIN
		 * System.out.println("Hi, " + name + "."); // Writing output to STDOUT
		 * 
		 */

		// Write your code here

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String bin = "";
		while (t-- > 0) {
			int a = s.nextInt();
			s.nextLine();
			bin = s.nextLine();
			int result = 0;
			for (char c : bin.toCharArray()) {
				if (c == '0')
					result++;
			}
			System.out.println(result);

		}

	}
}