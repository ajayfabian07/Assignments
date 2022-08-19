package com.te.squarenumber;

public class Sum {
	public static int sums(int num1)
	{
		int digit=0;
		int sum=0;
		while(num1>0)
		{
		digit=num1%10;
			sum=sum+digit*digit;
			num1=num1/10;
		}
		return sum;
	}
}
