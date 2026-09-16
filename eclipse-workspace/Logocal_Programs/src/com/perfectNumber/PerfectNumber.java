package com.perfectNumber;

import java.util.Scanner;

public class PerfectNumber {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Enter The Number : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		
		for(int i = 1; i <= num/2; i++)
		{
			if(num % i == 0) {
				sum =sum + i;
			}
		}
		if(sum == num) {
			
			System.out.println("The " + num + " is Perfect Number. ");
		}else
		{
			System.out.println("The " + num + " is not Perfect Number. ");
		}
	}
	
}

