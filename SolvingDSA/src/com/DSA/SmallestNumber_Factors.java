package com.DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 Given a positive number N. 
 You need to find the smallest number S such that product of digits of S is equal to N.
 Sample input : 
 N=1000
 
 Sample output : 
 5558
*/
public class SmallestNumber_Factors {
 public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
	 int n=1000;
	 SmallestNumber(n);
}
 public static void SmallestNumber(int n) {
	 List<Integer>list = new ArrayList<>();

	 for(int i=9; i>1; i--) {
		 while(n%i==0 && i<10) {
			 list.add(i);
			 n=n/i;
			 System.out.print(i);
		 }
	 }

	 System.out.println();
	 
	 Collections.sort(list, Collections.reverseOrder());
	 System.out.println(list);
	 
	
}
}
