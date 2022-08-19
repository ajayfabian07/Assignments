package com.te.evenoddindex;

public class EvenOddIndex {
	public static int index(int num) {
		int sum1=0;
		int sum2=0;
		int digit1=0;
		int digit2=0;
		int t1=num;
		int t2=num;
		while(t1>0) { //22143
			digit1=t1%10;
			sum1=sum1+digit1;
			t1=t1/100;
		}
		t2=t2/10;
		while(t2>0) {
			digit2=t2%10;
			sum2=sum2+digit2;
			t2=t2/100;
		}
		
		if(sum1==sum2)
			return 1;
		else
			return -1;
	}
}
