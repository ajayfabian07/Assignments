package com.te.arraymanipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		
		System.out.println("Enter the input");
		int num=scanner.nextInt();
		
		for (int i = 0; i < num; i++) {
			list.add(scanner.nextInt());
		}
		
		for (int i = 0; i < num; i++) {
			list2.add(scanner.nextInt());
		}
		
		List<Integer> list3=  UserMainCode.generateOddEvenList(list, list2);
		for (Integer integer : list3) {
			System.out.println(integer);
		}
	}

}
