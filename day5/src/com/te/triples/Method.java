package com.te.triples;


public class Method {
	public static boolean checkTriplets(int arr[]) {
		boolean result = false;
		for (int i = 0; i < arr.length-2; i++) {
			if (arr[i] == arr[i + 1])
				if (arr[i + 1] == arr[i + 2])
					result = true;
		}
		return result;

	}


}
