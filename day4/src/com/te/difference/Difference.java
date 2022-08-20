package com.te.difference;

public class Difference {
	public static int diff(int array[])
	{
		int largest=array[0];
		int smallest=array[0];
		for(int i=0;i<array.length;i++) {
		if(largest<array[i])
			largest=array[i];
		else if(smallest>array[i])
			smallest=array[i];
		
		
	}
	int res=(largest-smallest);
	return res;
	}
}
