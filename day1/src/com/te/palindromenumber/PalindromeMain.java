package com.te.palindromenumber;

import java.util.Scanner;

public class PalindromeMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		System.out.println("Enter the Number");
		int num2=scanner.nextInt();
		int result=PalindromeMethod.palindrome(num,num2);
		System.out.println(result);
	}

}
