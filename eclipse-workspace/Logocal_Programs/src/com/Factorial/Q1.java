package com.Factorial;

import java.util.Scanner;

// Factorial Program
public class Q1 {

	public int factorial(int i1) {
		int fact = 1;

		for (int i = i1; i >= 1; i--) {
			fact = fact * i;
			
		}
		
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num = sc.nextInt();
		Q1 q = new Q1();
		int j = q.factorial(num);
		System.out.println("The Factorial of " + num + " is : " + j);
	

	}

}
