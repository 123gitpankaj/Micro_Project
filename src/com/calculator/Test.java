package com.calculator;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
    System.out.println("Enter The Operation name :");
    Scanner sc = new Scanner(System.in);
    int id = sc.nextInt();
    
    if (id==1) {
    	
    	AdditionImpl additionImpl  = new AdditionImpl();
    	additionImpl.addTwonumbers();
		
	}
    
    else if (id==2) {
		
    	SubtractionImpl subtractionImpl = new SubtractionImpl();
    	subtractionImpl.subtarctTwoNumbers();
	}
    
    else if (id==3) {
		
    	MultiplicationImpl multiplicationImpl = new MultiplicationImpl();
    	multiplicationImpl.multiplyTwoNumbers();
	}
    
    else if (id==4) {
		
    	DivisionImpl divisionImpl = new DivisionImpl();
    	divisionImpl.getDivision();
    	
	}
    
    
    else if (id==5) {
		
    	ModulusImpl modulusImpl = new ModulusImpl();
    	modulusImpl.getReminder();
    	
	}
    
    else if (id==6) {
		
    	SquareImpl squareImpl = new SquareImpl();
    	squareImpl.getSquare();
	}
    
    else if (id==7) {
		
    	CubeImpl cubeImpl = new CubeImpl();
    	cubeImpl.getCube();
	}
    
    else if (id==8) {
    	
    	AvarageImpl avarageImpl = new AvarageImpl();
    	avarageImpl.getAvarage();
		
	}
    
    
    else if (id==9) {
    	
    	FactorsImpl factorsImpl  = new FactorsImpl();
    	factorsImpl.getFactors();
		
    	
	}
    
    
    else if (id==10) {
    	
    	EvenOrSumImpl evenOrSumImpl = new EvenOrSumImpl();
    	evenOrSumImpl.getNumber();
		
	}
    
    
    else {
		
    	System.out.println("Invalid ID");
    	
	}
    
    
    
    
    
    
    
    

    
	}
	
	
}