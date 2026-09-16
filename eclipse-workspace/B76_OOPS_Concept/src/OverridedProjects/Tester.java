package OverridedProjects;

public class Tester extends Employee{

	@Override
	public double calculateSalary(double esalary) {
		double bonus = esalary + 5000;
		return bonus;
	}
	
	
}
