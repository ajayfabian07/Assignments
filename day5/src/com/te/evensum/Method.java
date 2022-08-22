package com.te.evensum;

public class Method {
	public static int even(int array[]) {
		int sum = 0;
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					array[j] = 0;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 && array[i] != 0)
				sum = sum + array[i];
		}
		if (sum == 0)
			result = -1;
		else
			result = sum;
		return result;
		}

}
