package com.dstructures;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Recursive_fwd_sum {

	public static void main(String[] args) {

		
		 DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	       
		System.out.println(sdf.format(new Date()));
		System.out.println(num_sum(50000));
		System.out.println(sdf.format(new Date()));
		System.out.println("=========================");
		System.out.println(sdf.format(new Date()));
		System.out.println(reverse_sum(50000,0));
		System.out.println(sdf.format(new Date()));

	}

	static int num_sum(int num) {

		if (num <= 1)
			return num;
		else
			return num + num_sum(num - 1);

	}
	
	static int reverse_sum(int actual, int temp_result ) {
		if(actual <=1 )
			return actual + temp_result;
		else
			return reverse_sum((actual-1), (actual +temp_result));
	}

}
