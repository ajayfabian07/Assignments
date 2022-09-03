package com.te.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode {
	public static ArrayList<Integer> answer (ArrayList<Integer> a1, ArrayList<Integer> a2) {
		a1.addAll(a2);
		Collections.sort(a1);
		ArrayList<Integer> abc = new ArrayList<Integer>();
		abc.add(a1.get(2));
		abc.add(a1.get(6));
		abc.add(a1.get(8));
		return abc;
	}
}