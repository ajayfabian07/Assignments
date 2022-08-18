package com.te;
import java.util.Scanner;
public class Factorial {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int fact=1;
		System.out.println("Enter the Number");
		int n=s.nextInt();
		for(int i=n;i>=2;i--)
			fact=fact*i;
		System.out.println(fact);
		
	}

}
