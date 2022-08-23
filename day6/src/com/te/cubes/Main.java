package com.te.cubes;

import java.util.Scanner;

import com.te.boundary.Boundary;

public class Main {
	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=scanner.nextInt();
	int array[]=new int[size];
			for (int i = 0; i < array.length; i++) {
				array[i]=scanner.nextInt();
			}
			int result=Cubes.cub(array);
	System.out.println(result);
	}
	
}

