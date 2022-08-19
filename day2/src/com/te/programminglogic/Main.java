package com.te.programminglogic;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num1=scanner.nextInt();
		System.out.println("Enter the Number");
		int num2=scanner.nextInt();
		System.out.println("Enter the Number");
		int num3=scanner.nextInt();
		
		int result=Program.pgm(num1,num2,num3);
				System.out.print(result);
	}

}
