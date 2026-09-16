package OverridedProjects;

public class Developer extends Employee{
	
	@Override
	public double calculateSalary(double esalary) {
		double bonus = esalary + 10000;
		return bonus;
	}
	
}
