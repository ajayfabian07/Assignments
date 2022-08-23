package com.te.largest;

public class Largest {
	
	public static int large(int array[]) {
		int largest=array[0];
		for (int i = 0; i < array.length; i++) {
				if(largest<array[i])
					largest=array[i];
		}
	return largest;
}
}

}
