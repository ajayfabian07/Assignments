package com.te;

public class Reverse1 {
	public static void main(String[] args) {
		int n = 1346;
		int last = n % 10;
		int sum = 0;
		while (n > 9) {
			sum = sum + (n % 10);// 4/4/2/1/3
			n = n / 10;
		}

		int b = n + last;
		if (b == sum)
			System.out.println("xylem");
		else
			System.out.println("Not a Xylem");
	}

}
