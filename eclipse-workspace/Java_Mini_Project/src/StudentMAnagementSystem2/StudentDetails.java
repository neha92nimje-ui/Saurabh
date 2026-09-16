package StudentMAnagementSystem2;

public class StudentDetails {

	public void addCourse() {
		Course c = new Course();
		c.cid = 123;
		c.cname = "Java FullStack";
		StudentAdmin sa = new StudentAdmin();
		sa.displayCourse(c);
	}
	public void addFaculty() {
		Faculty f = new Faculty();
		f.fid = 123;
		f.fname = "Nilesh Ugale";
		StudentAdmin sa = new StudentAdmin();
		sa.displayFaculty(f);
	}
	public void addBatch() {
		Batch b = new Batch();
		b.bid = 456;
		b.bname = "Batch 76";
		StudentAdmin sa = new StudentAdmin();
		sa.displayBatch(b);
	}
	public void addStudent() {
		Student s = new Student();
		s.sid = 2382;
		s.sname = "Saurabh Nimje";
		StudentAdmin sa = new StudentAdmin();
		sa.displayStudent(s);
	}
	
	
}
