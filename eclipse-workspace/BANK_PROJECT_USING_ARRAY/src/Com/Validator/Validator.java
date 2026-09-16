package Com.Validator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {

	static Scanner sc = new Scanner(System.in);

	public static String accountName() {
		System.out.print("	Enter Account Holder Name : ");
		String acname = sc.nextLine().trim();
		if (Pattern.matches("[A-Za-z ]{3,}", acname)) {
			return acname;
		} else {
			System.out.println("	Enter Correct Name.");
			return accountName();
		}
	}
	
	public static String panNo() {
		
		System.out.print("\n	Enter Pan Number : ");
		String panno = sc.nextLine();
		if(Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", panno)) {
			return panno;
		}else
			System.out.println("	Kindly Enter Correct Details.");
		return panNo();
	}

}
