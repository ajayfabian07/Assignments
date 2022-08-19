package com.te.squaredigit;

import java.util.Scanner;

public class SquareNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		int result=SquareMethod.square(num);
				System.out.println(result);
	}

}
