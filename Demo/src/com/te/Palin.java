package com.te;

public class Palin {
	public static void main(String[] args) {
			System.out.println("****");
			int n=111;
			int temp=n;
			int sum=0;
			while(n>0)
			{
				int rem=n%10;
				sum=sum*10+rem;
				n=n/10;
			}
			if(temp==sum)
				System.out.println("Palindrome");
			else
				System.out.println("Not a Palindrome");
		}
	}