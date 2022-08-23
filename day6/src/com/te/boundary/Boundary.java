package com.te.boundary;

import java.util.Arrays;

public class Boundary {
	public static float boun(int[] array) {
		Arrays.sort(array);
		int min=array[0];
		int max=array[array.length-1];
		float average=(float)(min+max)/2;
		return average;
		
	}
}
