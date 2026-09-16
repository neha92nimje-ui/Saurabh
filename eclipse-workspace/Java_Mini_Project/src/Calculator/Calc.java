package Calculator;

import java.util.Scanner;

//1. Options
// 2. input
// 3. OPERATIONS
// 4. CONTINUE/EXIT
public class Calc {
	static {
		System.out.println("----- CALCULATOR APPLICATION STARTED -----\n");

	}

	Scanner sc = new Scanner(System.in);

	public void addition() {
		System.out.print("\n****** Enter Two Numbers ******\n\n First Number : ");
		int num1 = sc.nextInt();
		System.out.print("\n Second Number : ");
		int num2 = sc.nextInt();
		int add = num1 + num2;
		System.out.print("\n The Addition of " + num1 + " + " + num2 + " is " + add);
	}

	public void substraction() {
//		Scanner sc = new Scanner(System.in);
		System.out.print("\n****** Enter Two Numbers ******\n First Number : ");
		int num1 = sc.nextInt();
		System.out.print("\n Second Number : ");
		int num2 = sc.nextInt();
		int sub = num1 - num2;
		System.out.println("The Substraction of " + num1 + " - " + num2 + " is " + sub);
	}

	public void multiplication() {
//		Scanner sc = new Scanner(System.in);
		System.out.print("\n****** Enter Two Numbers ******\n First Number : ");
		int num1 = sc.nextInt();
		System.out.print("\n Second Number : ");
		int num2 = sc.nextInt();
		int mul = num1 * num2;
		System.out.print("The Multiplication of " + num1 + " X " + num2 + " is " + mul);

	}

	public void division() {

//		Scanner sc = new Scanner(System.in);
		System.out.print("\n****** Enter Two Numbers ******\n First Number : ");
		int num1 = sc.nextInt();
		System.out.print("\n Second Number : ");
		int num2 = sc.nextInt();
		int div = num1 / num2;
		System.out.print("The Division of " + num1 + " X " + num2 + " is " + div);

	}

	public void modulous() {

		Scanner sc = new Scanner(System.in);
		System.out.print("\n****** Enter Two Numbers ******\n\n         First Number : ");
		int num1 = sc.nextInt();
		System.out.print("\n         Second Number : ");
		int num2 = sc.nextInt();
		int mod = num1 % num2;
		System.out.print("The Remainder of " + num1 + " % " + num2 + " is " + mod);

	}

	public static void main(String[] args) {

		boolean flag = true;
		do {
			System.out.println("\n***** OPTIONS *****");
			System.out.println("\n 1. ADDITION \n");
			System.out.println(" 2. SUBSTRACTION\n");
			System.out.println(" 3. MULTIPLICATION \n");
			System.out.println(" 4. DIVISION\n");
			System.out.println(" 5. MODULOUS\n");
			System.out.println(" 6. Exit\n");

			Scanner sc = new Scanner(System.in);
			System.out.print("CHOOSE THE OPERATION NUMBER FROM ABOVE : ");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				Calc c = new Calc();
				c.addition();
				break;
			case 2:
				Calc c1 = new Calc();
				c1.substraction();
				break;
			case 3:
				Calc c2 = new Calc();
				c2.multiplication();
				break;
			case 4:
				Calc c3 = new Calc();
				c3.division();
				break;
			case 5:
				Calc c4 = new Calc();
				c4.modulous();
				break;
			case 6:
				flag = false;
				System.out.println("Exited Successfully!!");
				break;
			default:
				System.out.println("Entered Wrong Input !!!!");
				break;
			}
			boolean flag1 = true;
			do {
				System.out.println("\n\nDo you Want to Continue : \n 1. Yes \n 2. No");
				int x = sc.nextInt();
				switch (x) {
				case 1:
					flag = true;
					flag1 = false;
					break;
				case 2:

					flag = false;
					flag1 = false;
					System.out.println("Exited Successfully!!");
					break;
				default:
					System.out.println("\nYou Entered Wrong Value. Kindly Enter Correct Value.");
				}
			} while (flag1);

		} while (flag);
	}

}
