package com.te.fibonaccinumber;
import java.util.*;
public class FibonacciMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		int result=FibonacciMethod.fibonacci(num);
		System.out.println("[" + result + "]");
	
	
	}

}
