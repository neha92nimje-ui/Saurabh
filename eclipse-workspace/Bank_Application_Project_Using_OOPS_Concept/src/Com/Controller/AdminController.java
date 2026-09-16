package Com.Controller;

import java.util.Scanner;

import Com.ServiceIMPL.SBI;
import Com.Service.RBI;

public class AdminController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("  ");
		System.out.println("|*************************** Welcome To SBI ***************************|");
		System.out.println(" ");
		RBI rbi = new SBI();
		boolean flag = true;
		boolean flag1 = true;

		do {
			System.out.println(" ______________________________________________________________________ ");
			System.out.println("|                                                                      |");
			System.out.println("|-------------------------------- MENU --------------------------------|");
			System.out.println("|______________________________________________________________________|");
			System.out.println("|                                                                      |");
			System.out.println("| 1. Create Account 		  |	2. Display Account Details     |");
			System.out.println("| 3. Display Account Balance	  |	4. Withdraw Amount             |");
			System.out.println("| 5. Deposit Money 		  |	6. Update Account Details      |");
			System.out.println("| 7. Exit			  |                                    |");
			System.out.println("|______________________________________________________________________|");

			System.out.print("	Enter The Choice : ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				rbi.createAccount();
				break;
			case 2:
				rbi.displayAccountDetails();
				break;
			case 3:
				rbi.displayBalance();
				break;
			case 4:
				rbi.withdrawAmount();
				break;
			case 5:
				rbi.depositMoney();
				break;
			case 6:
				rbi.updateAccontDetails();
				break;
			case 7:
				flag = false;
				flag1 = false;
				System.out.println("	Exit Successfully.....!!!\nThanks For Using Our Application.");
				break;
			default:
				System.out.println("	Invalid Choice Entered. Try Again");
				break;
			}
//			flag1 = true;
			do{
				System.out.println("	Do You Want To Return To Main Menu ? \n	1. Yes       2. No");
				System.out.print("	Enter Your Choice : ");
				int op = sc.nextInt();
				switch (op) {
				case 1:
					flag1 = false;
					break;
				case 2:
					flag1 = false;
					flag = false;
					System.out.println("	Exit Successfully.....!!!\nThanks For Using Our Application.");
					break;
				default:
					System.out.println("	Incorrect Input.....!! Try Again..... !!");
				}

			}while (flag1);
		}
		while (flag);

	}
}
