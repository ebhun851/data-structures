package com.dstructures;

import java.util.Arrays;
import java.util.HashMap;

public class AList {

	Object[] myStore;
	int actualSize = 0;

	AList() {
		myStore = new Object[2];
	}

	public void addElement(Object element) {

		if ((myStore.length - actualSize) <= 2) {
			increaseSize();
		}
		myStore[actualSize++] = element;

	}

	private void increaseSize() {

		myStore = Arrays.copyOf(myStore, myStore.length * 2);
		System.out.println("new lenght :" + myStore.length);
	}

	public static void main(String[] args) {

		Object[] someArr = new Object[20];
		
		System.out.println("Array length : "+someArr.length);
		AList a = new AList();

		a.addElement("one");
		a.addElement("2");
		a.addElement("3");
		a.addElement("4");
		
		HashMap<String, String> maps = new HashMap<String, String>();
		
		

	}
}
