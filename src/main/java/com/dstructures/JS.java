package com.dstructures;

import java.util.HashMap;
import java.util.Map;

public class JS {

	public static void main(String[] args) {

		String J = "z";
		String S = "ZZ";

		char sa[] = S.toCharArray();
		char ja[] = J.toCharArray();

		int counter = 0;
		for (char c : ja) {
			int jcompare = (int) c;

			for (char x : sa) {

				if (jcompare == (int) x) {
					counter++;
				}
			}

		}

		System.out.println("matched stones as jewels : " + counter);
		Map<Character, Boolean> cb = new HashMap<Character, Boolean>();

		cb.put('a', true);
		cb.put('A', false);

		System.out.println(cb.get('a'));
		System.out.println(cb.get('A'));

		Map<String, Boolean> sb = new HashMap<String, Boolean>();

		sb.put("a", true);
		sb.put("A", false);

		System.out.println(sb.get("a"));
		System.out.println(sb.get("A"));

	}

}
