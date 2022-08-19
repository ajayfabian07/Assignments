package com.te.reversenumber;

import java.util.Scanner;

public class ReverseMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		int result=ReverseMethod.reverse(num);
		System.out.println(result);

	}

}

