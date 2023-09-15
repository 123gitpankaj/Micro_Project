package com.calculator;

import java.util.Scanner;

public class SquareImpl implements Square{
	
	
	@Override
	public void getSquare() {
		
		System.out.println("Enter the  number :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
        int square = num * num ;
        System.out.println("Multiplication of two numbers are :"+square);
		
		
	}

}
