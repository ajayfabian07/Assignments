package com.te.reverse;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String result=scanner.nextLine();
		
		System.out.println(UserMainCode.reshape(result));
		
	}

}
