package com.te.sumdigits;

public class DigitMethod {
	public static int digit(int num)
	{
		int digit=0;
		int sum=0;
		int count=0;
		
		while(num>0)
		{
			digit=num%10;
			if(digit==7)
				count++;
			num=num/10;
		}
			return count;
		}
	}

