package com.te.Perfect;

public class Perfect {
	public static int aa(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0)
				sum=sum+i;
	}
	if(sum==num)
		return 1;
	else
		return -1;
	}

}
