package com.perfectNumber;

import java.util.Scanner;

public class perfectNumber1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Number : ");
		int digit = sc.nextInt();
		System.out.println("The Perfect Numbers Are : ");

		for (int i = 1; i <= digit; i++) {
			int sum = 0;

			for (int j = 1; j <= i / 2; j++) {
				int num = i;
				if (num % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == i) {
				System.out.println(i);
			}
		}

	}
}
