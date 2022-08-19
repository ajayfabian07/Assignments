package com.te.squaredigit;

public class SquareMethod {

	public static int square(int num)
	{
		
		int digit=0;
		int sum=0;
		
		while(num>0)
		{
		digit=num%10;
		if(digit%2==0)
			sum=sum+digit*digit;
		num=num/10;
		
	}
		return sum;

}
}
