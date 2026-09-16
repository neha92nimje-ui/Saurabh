package Calculator;

import java.util.Scanner;

public class Calculator {

	static {
		System.out.println("😎😎 Welcome to Calculator Made by Saurabh 😎😎");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {

			System.out.print("Enter First Number : ");
			long num1 = sc.nextLong();

			System.out.print("Enter Second Number : ");
			long  num2 = sc.nextLong();
			boolean flag1 = true;
			do {
				System.out.print("Enter Operator ( + , - , * , / , % ): ");
				char c = sc.next().charAt(0);

				switch (c) {
				case '+':
					System.out.println("\nThe Addition of " + num1 + " & " + num2 + " is : " + (num1 + num2));
					break;
				case '-':
					System.out.println("\nThe Addition of " + num1 + " & " + num2 + " is : " + (num1 - num2));
					break;
				case '*':
					System.out.println("\nThe of Multiplication " + num1 + " & " + num2 + " is : " + (num1 * num2));
					break;
				case '/':
					System.out.println("\nThe Division of " + num1 + " & " + num2 + " is : " + (num1 / num2));
					break;
				case '%':
					System.out.println("\nThe of Modulus " + num1 + " & " + num2 + " is : " + (num1 % num2));
					break;
				default:
					System.out.println("\nIncorrect value Enter. Kindly Enter Again");

					break;
				}
				if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
					flag1 = false;
				}

			} while (flag1);
			System.out.print("Do you want to continue ?\n1.Yes		 2.No    : ");
			int i = sc.nextInt();
			if (i == 2) {
				flag = false;
				System.out.println("Exited Successfully !!!");
			}
		} while (flag);
	}
}