package com.te.sumdigits;

import java.util.Scanner;

public class DigitMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		int result=DigitMethod.digit(num);
		System.out.println(result);

	}

}
