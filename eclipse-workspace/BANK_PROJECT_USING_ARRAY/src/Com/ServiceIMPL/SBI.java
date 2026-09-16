package Com.ServiceIMPL;

import java.util.Scanner;

import Com.Model.Account;
import Com.Service.RBI;
import Com.Validator.Validator;
import Com.Controller.*;

public class SBI implements RBI {
	Scanner sc = new Scanner(System.in);
	boolean flag3 = true;
	Account[] accounts = new Account[100];
	int count = 0;

	@Override
	public void createAccount() {
		Account ac = new Account();
		System.out.println("\n	********** WELCOME TO CREATE ACCOUNT **********\n");
//		sc.nextLine();
		ac.setAccHolderName(Validator.accountName());
		
		System.out.print("\n	Enter Address  : ");
		ac.setAddress(sc.nextLine());
		System.out.print("\n	Enter Contact Number : ");
		ac.setMobileNo(sc.nextLong());
		System.out.print("\n	Enter Aadhar number : ");
		ac.setAadharNo(sc.nextLong());
		sc.nextLine();
		ac.setPanNo(Validator.panNo());

		System.out.print("\n	Enter Amount To Create Account : ");
		ac.setBalance(sc.nextDouble());

		System.out.print("\n	Create PIN : ");
		ac.setPin(sc.nextInt());
		if (ac.getAadharNo() != 0 && ac.getAccHolderName() != null && ac.getAddress() != null && ac.getBalance() != 0
				&& ac.getMobileNo() != 0 && ac.getPanNo() != null && ac.getPin() != 0) {
			System.out.println("\n	Account Created Successfully.....!!!");

			System.out.println("	Your Account Number is : " + ac.getAccNo() + " Use This Account Number for Reference.");
			accounts[count] = ac;
			count++;
		} else {
			System.out.println("	KINDLY FILL THE INFORMATION PROPERLY.");
		}
	}

	@Override
	public void displayAccountDetails() {
		boolean flag = true;
		do {
			System.out.print("	Enter Account Number : ");
			int accno = sc.nextInt();
			System.out.print("	Enter The PIN :");
			int pin = sc.nextInt();
			for (int i = 0; i < count; i++) {
				boolean flag1 = true;
				Account ac = accounts[i];
				if (accno == ac.getAccNo() && pin == ac.getPin()) {

					System.out.println(" ================================================================= ");
					System.out.println(" ----------------- The Account Details Are Below ----------------- ");
					System.out.println(" ================================================================= ");
					System.out.println("                                                                 ");
					System.out.println(" 1. Account Number        : " + ac.getAccNo() + " \n");
					System.out.println(" 2. Account Holder Name   : " + ac.getAccHolderName() + " \n");
					System.out.println(" 3. Address               : " + ac.getAddress() + " \n");
					System.out.println(" 4. PAN CARD Number       : " + ac.getPanNo() + " \n");
					System.out.println(" 5. Aadhar CARD Number    : " + ac.getAadharNo() + " \n");
					System.out.println(" 6. Contact Number        : " + ac.getMobileNo() + " ");
					System.out.println("_________________________________________________________________|");
					flag = false;
					flag1 = false;
				}
				if (flag1) {
					System.out.println("	Incorrect Credentials....!! Try again.....!!");
				}
			}
		} while (flag);
	}

	@Override
	public void displayBalance() {
		boolean flag = true;
		int found = 1;
		do {

			System.out.print("	Enter Account Number : ");
			int accno = sc.nextInt();
			System.out.print("	Enter The PIN :");
			int pin = sc.nextInt();
			for (int i = 0; i < count; i++) {
				boolean flag2 = true;
				Account ac = accounts[i];
				if (accno == ac.getAccNo() && pin == ac.getPin()) {
					flag = false;
					System.out.println("	The Account Balance : " + ac.getBalance());
					flag2 = false;
				}
				if(flag2) {
					System.out.println("	Incorrect Credentials....!! Try again.....!!");
				}
			}
		} while (flag);
	}

	@Override
	public void withdrawAmount() {
		boolean flag = true;
		do {
			System.out.print("	Enter Account Number : ");
			int accno = sc.nextInt();
			for (int i = 0; i < count; i++) {
				Account ac = accounts[i];
				if (accno == ac.getAccNo()) {
					flag = false;

					System.out.print("	Enter Amount To be Withdraw  : ");
					double wa = sc.nextDouble(); // wa == Withdraw Amount
					if (wa == 0) {
						System.out.println("	Withdrawn Amount cannot be Zero ... !");
					} else if (wa < 0) {
						System.out.println("	Withdrawal Amount Cannot be in Minus.");
					} else if (wa > 0 && wa <= ac.getBalance()) {
						boolean flag2 = true;
						do {
							System.out.print("	Enter The PIN :");
							int pin = sc.nextInt();
							if (pin == ac.getPin()) {
								flag2 = false;
								ac.setBalance(ac.getBalance() - wa);
								System.out.println("	Amount Withdraw Successfully.");
								boolean flag4 = true;
								do {
									System.out.println("	Do You Want To Show Balance ? \n	1. Yes     2. No");
									int op1 = sc.nextInt();
									switch (op1) {
									case 1:
										flag4 = false;
										System.out.println("	The Balance is : " + ac.getBalance() + ".");
										break;
									case 2:
										flag4 = false;
										break;
									}
								} while (flag4);
							} else {
								System.out.println("	Incorrect PIN.....!! Try Again....!!");

								while (flag3) {
									System.out.println("	Do you want to Re-Enter The PIN ? \n	1. Yes      2. No");
									int op1 = sc.nextInt();
									switch (op1) {
									case 1:
										break;
									case 2:
										flag3 = false;
										break;
									default:
										System.out.println("	Incorrect Input.....!! Try Again....");
									}
								}
							}
						} while (flag2);
					} else {
						System.out.println("	Insufficient Balance......!!");
					}
				} else {
					System.out.println("	Incorrect Account Number....!! Try again.....!!");
				}
			}
		} while (flag);
	}

	@Override
	public void depositMoney() {
		System.out.print("	Enter Account Number To Deposit Amount  : ");
		int accno = sc.nextInt();
		for (int i = 0; i < count; i++) {
			Account ac = accounts[i];
			if (accno == ac.getAccNo()) {
				System.out.print("	Enter The Amount to be Deposit : ");
				double deposit = sc.nextDouble();
				if (deposit == 0) {
					System.out.println("	Deposit Amount Should Not Be Zero. \n You Entered :" + deposit);
				} else if (deposit < 0) {
					System.out.println("	Deposit Amount shouldn't Be in Minus. \n You Entered : " + deposit);
				} else {
					System.out.print("	Enter Ypur PIN : ");
					int pin = sc.nextInt();
					if (pin == ac.getPin()) {
						ac.setBalance(ac.getBalance() + deposit);
						System.out.println("	Amount " + deposit + " is Successfully Credited.");
						boolean flag4 = true;
						do {
							System.out.print("	Do You Want To Show Balance ? \n 1. Yes     2. No");
							int op1 = sc.nextInt();
							switch (op1) {
							case 1:
								flag4 = false;
								System.out.println("	The Balance is : " + ac.getBalance() + ".");
								break;
							case 2:
								flag4 = false;
								break;
							}
						} while (flag4);
					} else {
						boolean flag5 = true;
						System.out.println("	Incorrect PIN Entered ... Try Agin .... !!");
						while (flag5) {
							System.out.println("	Do you want to Re-Enter The PIN ? \n1. Yes      2. No");
							int op1 = sc.nextInt();
							switch (op1) {
							case 1:
								break;
							case 2:
								flag5 = false;
								break;
							default:
								System.out.println("	Incorrect Input.....!! Try Again....");
							}
						}
					}
				}
			} else {
				System.out.println("	Incorrect Credentials . Redirecting to Main Menu.");
			}
		}
	}

	@Override
	public void updateAccontDetails() {
		System.out.println("	Login in Your Account Using Account Number And PIN :");
		System.out.print("	Enter Account number : ");
		int acno = sc.nextInt();
		System.out.print("	Enter PIN : ");
		int pin = sc.nextInt();
		boolean flag10 = true;
		for (int i = 0; i < count; i++) {
			Account ac = accounts[i];
			if (acno == ac.getAccNo() && pin == ac.getPin()) {
				do {
//				System.out.println("|*************************** Welcome To SBI ***************************|");
					System.out.println(" ______________________________________________________________________ ");
					System.out.println("|                                                                      |");
					System.out.println("|-------------------- Account Details Update Menu ---------------------|");
					System.out.println("|______________________________________________________________________|");
					System.out.println("|                                                                      |");
					System.out.println("| 1. Update Account Holder Name	  |   2. Update Address                |");
					System.out.println("| 3. Update PIN   	    	  |   4. Update Contact Number         |");
					System.out.println("| 5. Exit      			  |                                    |");
					System.out.println("|______________________________________________________________________|");

					System.out.print("	Enter The Choice : ");
					int ch = sc.nextInt();
					switch (ch) {
					case 1:
						System.out.print("	Enter Account Holder Name : ");
						sc.nextLine();
						ac.setAccHolderName(sc.nextLine());
						System.out.println("	Account Holder Name Updated Successfully.");

						break;
					case 2:
						System.out.print("	Enter Address  : ");
						sc.nextLine();
						ac.setAddress(sc.nextLine());
						System.out.println("	Address Updated Successfully.");

						break;
					case 3:
						System.out.print(" Update PIN : ");
						ac.setPin(sc.nextInt());
						System.out.println(" PIN Updated Successfully.");

						break;
					case 4:
						System.out.print("	Enter Contact Number : ");
						ac.setMobileNo(sc.nextLong());
						System.out.println("	Contact Details Updated Successfully.");
						break;
					case 5:
						flag10 = false;
						break;

					default:
						System.out.println("	Incorrect Choice Entered. Try Again.");
					}
					if (flag10 == true) {
						boolean flag11 = true;
						while (flag11) {
							System.out
									.println("	Do You Want To Continue Update Information ? \n	1. Yes       2. No");
							System.out.println("	Enter Your Choice : ");
							int op = sc.nextInt();
							switch (op) {
							case 1:
								flag11 = false;
								break;
							case 2:
								flag11 = false;
								flag10 = false;
								System.out.println("	Returning To Main Menu.");
								break;
							default:
								System.out.println("	Incorrect Input.....!! Try Again..... !!");
							}

						}
					}

				} while (flag10);

			}
		}
	}

}
