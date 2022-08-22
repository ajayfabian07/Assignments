package com.te.addreverse;

public class Method {
	public static int add(int array[]) {
		int sum = 0;
		int digit=0;
		int copy=sum;
		int rev=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 15)
				sum = sum + array[i];
			
		}
		System.out.println("The Sum of The Digit :" +sum);
		while(sum>0)
		{
			digit=sum%10;
			rev=rev*10+digit;
			sum=sum/10;
			
		}
		

		return rev;

}
}
