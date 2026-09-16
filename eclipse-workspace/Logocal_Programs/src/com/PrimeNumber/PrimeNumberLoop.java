package com.PrimeNumber;

import java.util.Scanner;

public class PrimeNumberLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int number = sc.nextInt();
		System.out.println("The Prime Numbers are : ");
		
		for(int num = 1 ; num <= number ; num++) {
		
		boolean isPrime = true;
		if(num <= 1)
		{
			isPrime = false;
		}else
		{
			for(int i = 2; i <= num/2; i++)
			{
				if(num % i == 0)
				{
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime)
		{
			System.out.println(num );
		}
	}
}
}