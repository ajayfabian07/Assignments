package com.te.arraytostring;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> arrayList = new ArrayList<String>();

		System.out.println("Enter the input");
		int size = scanner.nextInt();

		for (int i = 0; i < size; i++) {
			arrayList.add(scanner.next());
		}
		String[] strings=UserMainCode.convertToStringArray(arrayList);
		for (String string : strings) {
		System.out.println("The String Conversion is:"+string);	
		}
		
		
		scanner.close();
	}

}
