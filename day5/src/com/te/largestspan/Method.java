package com.te.largestspan;

public class Method {
	public static int getLargestSpan(int arr[]) {

		int first = 0;
		int second = 0;
		int len1 = arr.length;
		int len2 = arr.length;
		for (int i = 0; i < len1; i++) {

			for (int j = 1; j < len2; j++) {

				if (arr[i] == arr[j]) {
					first = i;
					second = j;
					len1 = i;
				}
			}
		}

		int result = (second - first) + 1;

		return result;

	}

}
