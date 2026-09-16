package Printing;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Enter Number: ");
			int i = sc.nextInt();
			System.out.println("--------------------");
			System.out.println(i);
			if(i == 0 ) {
				flag = false;
				System.out.println("Loop End!!!");
			}
		} while (flag);
	}
}