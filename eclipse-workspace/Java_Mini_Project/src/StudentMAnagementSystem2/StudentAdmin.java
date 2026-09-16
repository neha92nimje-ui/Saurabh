package StudentMAnagementSystem2;

public class StudentAdmin {

	public void displayCourse(Course c) {
		System.out.println("The Course Details are : \n");
		System.out.println("The Course ID : " + c.cid + "\nThe Course Name :  " + c.cname);
	}
	public void displayFaculty(Faculty f) {
		System.out.println("\nThe Faculty Details are : \n");
		System.out.println("The Course ID : " + f.fid + "\nThe Course Name :  " + f.fname);
	}
	public void displayBatch(Batch b) {
		System.out.println("\nThe Batch Details are : \n");
		System.out.println("The Batch ID : " + b.bid + "\nThe Batch Name :  " + b.bname);
	}
	public void displayStudent(Student s) {
		System.out.println("\nThe Student Details are : \n");
		System.out.println("The Student ID : " + s.sid + "\nThe Student Name :  " + s.sname);
	}
	
	
	
	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		sd.addStudent();
		sd.addBatch();
		sd.addCourse();
		sd.addFaculty();
		
	}
}
