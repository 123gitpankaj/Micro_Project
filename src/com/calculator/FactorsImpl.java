package com.calculator;

import java.util.Scanner;

public class FactorsImpl implements Factors {

	@Override
	public void getFactors() {
		
		System.out.println("Enter the Number :");
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		
		System.out.println("factors Of the number are :");
		
		for(int i=1;i<=num;i++) {
			
			if (num%i==0) {
				System.out.println(i);
			}
			
		}
	}
	
	

}
