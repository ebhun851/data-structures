package com.dstructures;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String str1 = "HelloH";

		Map<Character, Integer> charsMap = new HashMap<Character, Integer>();
		
		int strLength = str1.toCharArray().length;
		
		for(int i =0; i < strLength ; i++) {
			
			Character c = str1.toCharArray()[i];
			
			if(charsMap.get(c) != null) {
				Integer current = charsMap.get(c);
				charsMap.put(c, ++current);
			} else {
				charsMap.put(c, 1);
			}
		}
		for(Character  key : charsMap.keySet()) {
			if(charsMap.get(key) >= 2) {
				System.out.println(key + "  :  "+ charsMap.get(key) );
			}
		}
		
	}

}
