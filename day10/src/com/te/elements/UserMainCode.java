package com.te.elements;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	
	public static int[] arrayListSubtractor(List<Integer> a1, List<Integer> a2){
		
		List<Integer> temp1= new ArrayList<Integer>(a1);
		temp1.removeAll(a2);
		List<Integer> temp2=new ArrayList<Integer>(a2);
		temp2.removeAll(a1);
		temp1.addAll(temp2);
		
		int []num=new int[temp1.size()];
		Object[] array = temp1.toArray();
		for (int i = 0; i < array.length; i++) {
			num[i]= (int) array[i];
		}
		return num;
	}

}
