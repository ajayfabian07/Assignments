package com.te.sequence;

public class Method {
	public static boolean sequence(int arr[]) {
			boolean result = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 1)
					if (arr[i + 1] == 2)
						if (arr[i + 2] == 3)
							result = true;

			}
			return result;
		}
	}
	
