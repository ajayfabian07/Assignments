package com.te.day3;

public class Kaprekar {
	public static int aa(int num) {
		int n=num;
		int r;
		int q;
		int count=0;
		int sq=n*n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		r=sq%(int)Math.pow(10,count);
		q=sq/(int)Math.pow(10,count);
			
	if((r+q)==num)
		return 1;
	else
		return -1;
	}

}