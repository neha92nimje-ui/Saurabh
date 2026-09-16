package OverridedProjects;

public class Manager extends Employee{

	@Override
	public double calculateSalary(double esalary) {
		double bonus = esalary + 20000;
		return bonus;
	}
	
}
