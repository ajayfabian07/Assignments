package com.te.Perfect;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the input");
		int num=scanner.nextInt();
		int result=Perfect.aa(num);
				System.out.println(result);
				if(result==1)
					System.out.println("Perfect");
				else
					System.out.println("Not Perfect");
	}

}
