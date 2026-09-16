package Printing;

import java.util.Scanner;

public class Table {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int j = sc.nextInt();
		
		for(int i = 0; i <= 10 ; i++)
		{
			System.out.println(j + " X " + i +" = " +j*i);
		}
	}
}
