package Employee_Management_System;

public class Department {

	public void singleEmployee() {
		
		Employee e = new Employee(200917098 , "Ashwini Yede" , 12000);
		Controller c = new Controller();
		c.displaySingleEmployee(e);
	}
	public void AllEmployee() {
		
		AllEmployee e = new AllEmployee();
		Controller c = new Controller();
		c.displayAllEmployee(e);
	}
	
}
