package com.te.day3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		int result=Kaprekar.aa(num);
				System.out.println(result);
				if(result==1)
					System.out.println("yes");
				else
					System.out.println("no");
	}

}
