package com.machinetest;

import java.util.Scanner;

// Write a program to Menu driven program using switch statement (Find addition, subtraction, multiplication and division of two integer numbers)

public class MenuDriven {
	
	private void division(int a, int b) {
		int res = a / b;
		System.out.println("\nDivision : " + res);	
	}

	private void multiplication(int a, int b) {
		int res = a * b;
		System.out.println("\nMultiplication : " + res);	
	}

	private void subtraction(int a, int b) {
		int res = a - b;
		System.out.println("\nSubtraction : " + res);
	}

	private void addition(int a, int b) {
		int res = a + b;
		System.out.println("\nAddition : " + res);
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		MenuDriven obj = new MenuDriven();
		
		int a, b;
		
		while(true) {
			System.out.println("\n\n -----Enter your choice-----");
			System.out.println("Enter 1 for addition");
			System.out.println("Enter 2 for subtraction");
			System.out.println("Enter 3 for multiplication");
			System.out.println("Enter 4 for division");
			System.out.println("Enter 5 to exit");
			System.out.print("\nEnter your choice : ");
			int n = sc.nextInt();
			System.out.println();
			
			switch(n)
			{
				case 1: 
					System.out.println("Enter two integers");
					System.out.print("Enter first number: ");
					a = sc.nextInt();
					System.out.print("Enter second number: ");
					b = sc.nextInt();
					obj.addition(a, b);
					break;
				
				case 2: 
					System.out.println("Enter two integers");
					System.out.print("Enter first number: ");
					a = sc.nextInt();
					System.out.print("Enter second number: ");
					b = sc.nextInt();
					obj.subtraction(a, b);
					break;
						
				case 3: 
					System.out.println("Enter two integers");
					System.out.print("Enter first number: ");
					a = sc.nextInt();
					System.out.print("Enter second number: ");
					b = sc.nextInt();
					obj.multiplication(a, b);
					break;
						
				case 4: 
					System.out.println("Enter two integers");
					System.out.print("Enter first number: ");
					a = sc.nextInt();
					System.out.print("Enter second number: ");
					b = sc.nextInt();
					obj.division(a, b);
					break;
				
				case 5: System.out.println("\nExit");
						return;
			}
		}
	}

}
