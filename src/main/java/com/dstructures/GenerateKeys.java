package com.dstructures;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenerateKeys {

	public static void main(String[] args) {
		try {
			usingBufferedWritter();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static void usingBufferedWritter() throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter("keys.txt", true) 
		);

		List<String> keys = new ArrayList<String>();

		keys.add("large-blob-50k-for-load-testing-1");
		keys.add("large-blob-50k-for-load-testing-2");
		keys.add("large-blob-50k-for-load-testing-3");
		keys.add("large-blob-50k-for-load-testing-4");
		keys.add("large-blob-50k-for-load-testing-5");
		keys.add("large-blob-50k-for-load-testing-6");
		keys.add("large-blob-50k-for-load-testing-7");
		keys.add("large-blob-50k-for-load-testing-8");
		keys.add("large-blob-50k-for-load-testing-9");
		keys.add("large-blob-50k-for-load-testing-10");

		System.out.println("Keys generation started");

		for (int i = 0; i < 1000000; i++) {
			for (String key : keys) {
				writer.write(key);
				writer.newLine(); // Add new line

			}
		}

		writer.close();
		System.out.println("Keys generation completed");
	}
}
