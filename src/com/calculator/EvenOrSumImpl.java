package com.calculator;

import java.util.Scanner;

public class EvenOrSumImpl implements EvenOrSum{
	
	@Override
	public void getNumber() {
	
		System.out.println("Enter the Number :");
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		
		if (num%2==0) {
			System.out.println("Number is Even ");
		}
		else {
			System.out.println("Number Is Odd ");
		}
	}

}
