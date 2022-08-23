package com.te.middle;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Size");
	int size=scanner.nextInt();
	if(size>19 || size%2==0)
		System.out.println("Enter elements within 19 and Enter only the Odd Integer");
	else
	{
	int array[]=new int[size]; 
	System.out.println("Enter the Array elements");
		for (int i = 0; i < array.length; i++) {
				array[i]=scanner.nextInt();
			}
			int result=Middle.mid(array);
	System.out.println(result);
	
}
}
}

