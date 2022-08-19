package com.te.palindromenumber;

public class PalindromeMethod {
	public static int palindrome(int num, int num2) {
		int rev = 0;
		int temp;
		for (int i = num; i <= num2; i++) {
			int sum = i;
			
			while (sum > 0) {
				rev = rev * 10 + (sum % 10);
				sum = sum / 10;
			}
		}
		if(rev==temp)
			return 1;
		else
			return -1;
	}
}
