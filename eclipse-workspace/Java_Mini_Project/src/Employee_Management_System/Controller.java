package Employee_Management_System;

import java.util.Scanner;

public class Controller {
	public void displaySingleEmployee(Employee e) {
		System.out.println("The Single Employee Details Are : \n");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Employee ID : " + e.id );
		System.out.println("Employee Name : " + e.name);
		System.out.println("Employee Salary : " + e.salary );
		System.out.println("=======================================================================================");
	}

	public void displayAllEmployee(AllEmployee e1) {
		System.out.println("The All Employee Details Are : \n");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("The First employee Details are : \n");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Employee ID : " + e1.e1.id );
		System.out.println("Employee Name : " + e1.e1.name);
		System.out.println("Employee Salary : " + e1.e1.salary );
		System.out.println("=======================================================================================");
		
		
		
		System.out.println("The First employee Details are : \n");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Employee ID : " + e1.e2.id );
		System.out.println("Employee Name : " + e1.e2.name);
		System.out.println("Employee Salary : " + e1.e2.salary );
		System.out.println("=======================================================================================");
		
		
		System.out.println("The First employee Details are : \n");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Employee ID : " + e1.e3.id );
		System.out.println("Employee Name : " + e1.e3.name);
		System.out.println("Employee Salary : " + e1.e3.salary );
		System.out.println("=======================================================================================");		
	}

	public static void main(String[] args) {
		Department d = new Department();
		d.singleEmployee();
		d.AllEmployee();

	}
}
