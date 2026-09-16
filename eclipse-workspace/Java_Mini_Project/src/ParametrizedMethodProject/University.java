package ParametrizedMethodProject;

import java.util.Scanner;

public class University {
	int rn1, rn2, rn3;
	String name1, name2, name3, add1, add2, add3;

	public void displaySingleStudent(Student s) {
		System.out.println("The Single Student Details :\n");
		System.out.println("The Student Roll No : " + s.rollNo);
		System.out.println("The Student Name : " + s.name);
		System.out.println("The Student Address : " + s.address);
		System.out.println("----------------------------------------");
	}

	public void displayAllStudent(Allstudent as) {

		System.out.println("The All Student Details Are Below :\nThe First Student Details Are : \n");
		System.out.println("The Student Roll No : " + as.s1.rollNo);
		System.out.println("The Student Name : " + as.s1.name);
		System.out.println("The Student Address : " + as.s1.address);
		System.out.println("----------------------------------------");

		System.out.println("The Second Student Details Are : \n");
		System.out.println("The Student Roll No : " + as.s2.rollNo);
		System.out.println("The Student Name : " + as.s2.name);
		System.out.println("The Student Address : " + as.s2.address);
		System.out.println("----------------------------------------");

		System.out.println("The Third Student Details Are : \n");
		System.out.println("The Student Roll No : " + as.s3.rollNo);
		System.out.println("The Student Name : " + as.s3.name);
		System.out.println("The Student Address : " + as.s3.address);
		System.out.println("----------------------------------------");
	}

	public static void main(String[] args) {
		University u = new University();
		College c = new College();
		c.singleStudent();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll No :");
		u.rn1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name : ");
		u.name1 = sc.nextLine();
		System.out.print("Enter Address : ");
		u.add1 = sc.nextLine();

		System.out.println("Enter Second Student Details :");
		System.out.print("Enter Roll No :");
		u.rn2 = sc.nextInt();
		System.out.print("Enter Name : ");
		sc.nextLine();
		u.name2 = sc.nextLine();
		System.out.print("Enter Address : ");
		u.add2 = sc.nextLine();

		System.out.println("Enter Third Student Details :");
		System.out.print("Enter Roll No :");
		u.rn3 = sc.nextInt();
		System.out.print("Enter Name : ");
		sc.nextLine();
		u.name3 = sc.nextLine();
		System.out.print("Enter Address : ");
		u.add3 = sc.nextLine();

		c.allStudents(u);

	}
}
