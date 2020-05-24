package com.dstructures;

public class SubStrings {

	public static void main(String[] args) {

		String str ="voldemort-bin.s3-us-west-1.amazonaws.com";
		String kept = str.substring( 0, str.indexOf("."));
		
		System.out.println(str);
		System.out.println(kept);
	}

}
