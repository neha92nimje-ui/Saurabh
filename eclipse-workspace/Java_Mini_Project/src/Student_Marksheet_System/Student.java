package Student_Marksheet_System;

import java.util.Scanner;

public class Student {
	String name, result, grade;
	int rollno, sub1, sub2, sub3, total;
	double percentage;

	static {
		System.out.println("\"===== SCHOOL MARKSHEET SYSTEM =====\"");
	}
	{
		System.out.println("Generating Result.......");
	}

	Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public void inputMark(Scanner sc) {

		System.out.println("Enter Marks of Subject 1 :");
		sub1 = sc.nextInt();
		System.out.println("Enter Marks of Subject 2 :");
		sub2 = sc.nextInt();
		System.out.println("Enter Marks of Subject 3 :");
		sub3 = sc.nextInt();

	}

	public void calculate() {
		total = sub1 + sub2 + sub3;
		percentage = total / 3.0; // 3.0 to get decimal

		// Check Pass/Fail first
		if (sub1 < 35 || sub2 < 35 || sub3 < 35) {
			result = "FAIL";
		} else {
			result = "PASS";

			// Grade logic
			if (percentage >= 90) {
				grade = "A";
			} else if (percentage >= 75) {
				grade = "B";
			} else if (percentage >= 60) {
				grade = "C";
			} else {
				grade = "D";
			}
		}

	}

	public void displayResult() {
		System.out.println("\n========== MARKSHEET ==========");
		System.out.println("Name       : " + name);
		System.out.println("Roll No    : " + rollno);
		System.out.println("Subject 1  : " + sub1);
		System.out.println("Subject 2  : " + sub2);
		System.out.println("Subject 3  : " + sub3);
		System.out.println("-------------------------------");
		System.out.println("Total      : " + total);
		System.out.printf("Percentage : %.2f%%\n", percentage);
		if(result.equals("FAIL")) {
            System.out.println("Grade      : --");
            System.out.println("Result     : FAIL");
        } else {
            System.out.println("Grade      : " + grade);
            System.out.println("Result     : PASS");
        }
        System.out.println("===============================");
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
//		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Roll No : ");
		int rollno = sc.nextInt();
		
		Student s1 = new Student(name, rollno);
		
		s1.inputMark(sc);
		s1.calculate();
		s1.displayResult();
	}
	
	
}