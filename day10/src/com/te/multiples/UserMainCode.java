package com.te.multiples;

import java.util.ArrayList;

public class UserMainCode {
	
	public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> a1){
		
		for (int i = 2; i < a1.size(); i=i+2) {
			a1.remove(i);
			
		}
		return a1;
		
			 
		}
	}

