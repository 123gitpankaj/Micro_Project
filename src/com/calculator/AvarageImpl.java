package com.calculator;

import java.util.Scanner;

public class AvarageImpl implements Avarage {
	
	@Override
	public void getAvarage() {
		
		System.out.println("Enter the first number :");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number :");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number :");
        int num3 = scanner.nextInt();
        System.out.println("Enter the fourth number :");
        int num4 = scanner.nextInt();
        System.out.println("Enter the fifth number :");
        int num5 = scanner.nextInt();
        
        int avarage = (num1+num2+num3+num4+num5)/5 ; 

         System.out.println("Avarage of nummbers is :"+avarage);
		
	}

}
