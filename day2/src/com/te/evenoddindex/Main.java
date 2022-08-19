package com.te.evenoddindex;

import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		int result=EvenOddIndex.index(num);
		System.out.println(result);
		if(result==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
