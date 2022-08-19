package com.te.uniquenumber;
import java.util.Scanner;
public class UniqueMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		int result=UniqueMethod.unique(num);
		System.out.println(result);
		if(result==1)
			System.out.println("Unique");
		else
			System.out.println("Not a Unique");
	}
}
