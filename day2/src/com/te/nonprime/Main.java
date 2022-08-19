package com.te.nonprime;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		int result=NonPrime.abc(num);
				System.out.println(result);
				
	}

}
