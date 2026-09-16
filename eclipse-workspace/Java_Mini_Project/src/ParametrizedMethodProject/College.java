package ParametrizedMethodProject;

public class College {

	public void singleStudent() {
		
		Student s = new Student(123, "Sejal", "Nagpur");
		University u = new University();
		u.displaySingleStudent(s);	
	}
	public void allStudents(University u) {
		Allstudent as = new Allstudent(u);
		
		u.displayAllStudent(as);
	}
	
}
