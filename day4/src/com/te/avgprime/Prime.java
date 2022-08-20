package com.te.avgprime;

import java.text.DecimalFormat;

public class Prime {
	public static double pri(int array[]) {
		int sum = 0;
		int count = 0;
		int count1 = 0;
		double avg = 0;
		for (int i = 0; i < array.length; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {

				if (i%j == 0) 
					count++;
			}

			if (count == 2) {
				count1++;
				sum = sum + array[i];
			}
		}
		avg = (double)sum / count1;
		DecimalFormat df=new DecimalFormat("#.00");
		double ddd=Double.parseDouble(df.format(avg));
		return ddd;
	}

}
