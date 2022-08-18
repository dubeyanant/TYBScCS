package com.anant.ass1;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter value of n : ");
		int n = in.nextInt();
		
		ArrayList<String> names = new ArrayList<String>();
		
		System.out.print("Enter names of the countries : ");
		for(int i = 0; i < n; i++)
			names.add(in.next());
			
		System.out.println("Original arrangement : " + names);
		Collections.sort(names, Collections.reverseOrder());
		System.out.println("Descending arrangement : " + names);
	}
}
