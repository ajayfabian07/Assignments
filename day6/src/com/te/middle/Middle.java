package com.te.middle;

public class Middle {
	public static int mid(int array[]) {
		
		int last=array.length-1;
		int first=0;
		int mid=0;
		
		for (int i = 0; i < array.length; i++) {
			array [mid]=(last/2)+1;
			//System.out.println(array[i]);
		}
		int result=array[mid];
		return result;
		
	}

}
