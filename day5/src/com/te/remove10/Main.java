package com.te.remove10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size and elements :");
		int size = scanner.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int res[] = Method.removeTens(arr);
		for (int i = 0; i < res.length; i++) {

			System.out.println(res[i]);
		}
	}
	}
