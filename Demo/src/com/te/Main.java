package com.te;
import java.util.Scanner;

public class Main {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter the Number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
			
		}
		if (count==2)
		System.out.println("Prime");
		else
			System.out.println("Not a Prime");
	}

}
