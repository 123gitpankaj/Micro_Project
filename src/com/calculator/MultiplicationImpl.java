package com.calculator;

import java.util.Scanner;

public class MultiplicationImpl implements Multiplication{

	
	public void multiplyTwoNumbers() {
		
		System.out.println("Enter the first number :");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number :");
        int num2 = scanner.nextInt();
        
        int mutiply = num1 * num2 ;
        System.out.println("Multiplication of two numbers are :"+mutiply);
		
		
		
		
		
	}
}
