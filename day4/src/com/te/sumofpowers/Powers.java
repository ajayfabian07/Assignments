package com.te.sumofpowers;

public class Powers {

	public static int power(int array, int j) {
		int product = 1;
		for (int i = 1; i <= j; i++) {
			product = product * array;
		}
		return product;
	}

	public static int powe(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + power(array[i], i);
		}
		return sum;

	}

}
