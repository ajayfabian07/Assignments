package com.te.elements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		List<Integer> a1=new ArrayList<Integer>();
		List<Integer> a2=new ArrayList<Integer>();
		
		System.out.println("Enter the input");
		int num=scanner.nextInt();
	
		
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the a1 values");
			a1.add(scanner.nextInt());
		}
		
		System.out.println("Enter the input");
		int num3=scanner.nextInt();
		
		for (int i = 0; i < num3; i++) {
			System.out.println("Enter the a2 values");
			a2.add(scanner.nextInt());
		}
		
		int[] num2=UserMainCode.arrayListSubtractor(a1, a2);
		
		for (int i : num2) {
			System.out.println(i);
		}
		
		
	}

}
