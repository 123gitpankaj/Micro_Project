package com.calculator;

import java.util.Scanner;

public class CubeImpl implements Cube{

	
	@Override
	public void getCube() {
		
		
		System.out.println("Enter the  number :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
        int cube = num * num * num;
        System.out.println("Multiplication of two numbers are :"+cube);
	}
}
