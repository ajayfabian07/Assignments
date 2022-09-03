package com.te.arraymanipulation;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	
	public static List<Integer> generateOddEvenList(List<Integer> list, List<Integer> list2) {
		
		List<Integer> list3=new ArrayList();
		
		for (int i = 0; i < list2.size(); i+=2) {
			
			list3.add(list2.get(i));
		}
		for (int i = 1; i < list.size(); i+=2) {
			list3.add(i,list.get(i)); //2 option
		}
		return list3;
			
		}

}
