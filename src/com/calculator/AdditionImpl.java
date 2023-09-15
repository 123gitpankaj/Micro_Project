package com.calculator;

import java.util.Scanner;

public class AdditionImpl implements Addition{

	@Override
	public void addTwonumbers() {
		
		System.out.println("Enter the first number :");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number :");
        int num2 = scanner.nextInt();
        
        int addn = num1 + num2 ;
        System.out.println("Addition of two numbers are :"+addn);
	}
	
	
	
	

}
