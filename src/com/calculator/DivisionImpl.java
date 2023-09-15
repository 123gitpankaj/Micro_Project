package com.calculator;

import java.util.Scanner;

public class DivisionImpl implements Division{
	
	public void getDivision() {
		
		System.out.println("Enter the first number :");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number :");
        int num2 = scanner.nextInt();
        
        int divisn = num1 / num2 ;
        System.out.println("division of two numbers are :"+divisn);
		
		
	}

}
