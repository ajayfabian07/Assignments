package com.te.cubes;

public class Cubes {
	public static int cub (int array[]){
	int square=0;
	int cube=0;
	int sum=0;
	for (int i = 0; i < array.length; i++) {
		if(array[i]%2==0) {
			square+=array[i]*array[i];
		}
	}
	for (int j = 0; j < array.length; j++) {
		if(array[j]%2!=0) {
			cube+=array[j]*array[j]*array[j];
		}
	}
	sum=square+cube;
	return sum;
}
}

