package com.Factorial;

import java.util.Scanner;

public class NumSwapp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("The First Number After Swapping is :" + num1 + "\nThe Second Number After Swapping is " + num2);
		
	}	
}
