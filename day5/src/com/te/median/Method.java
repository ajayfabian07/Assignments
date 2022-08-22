package com.te.median;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Method {

	public static int median(int array[])
	{
		int mid=0;
		int last=array.length-1;
		int start=0;
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array);
			mid=(last-start)/2;
		}
			for (int i = 0; i < array.length; i++) {
				System.out.println("The Order of Arrays is : " +array[i]);
			}
		return array[mid];
	}
}
