package Tasks;

public class College {
	public void addSingleStudent() {
		Student s = new Student();
		s.setSid(123);
		s.setSname("Saurabh Nimje");
		s.setAddress("Nagpur");
		s.setContact(9145586945l);
		s.setGrade('A');
		University u = new University();
		u.displaySingleStudent(s);
	}

	public void addAllStudent() {
		AllStudent s = new AllStudent();

		s.s1.setSid(124);
		s.s1.setSname("Nilima Deotare");
		s.s1.setAddress("Wardha");
		s.s1.setContact(9592684029l);
		s.s1.setGrade('B');

		s.s2.setSid(125);
		s.s2.setSname("Sameer Raut ");
		s.s2.setAddress("Nagpur");
		s.s2.setContact(9365825699l);
		s.s2.setGrade('C');

		s.s3.setSid(125);
		s.s3.setSname("Ashwini Yede");
		s.s3.setAddress("Katol");
		s.s3.setContact(9579684029l);
		s.s3.setGrade('D');

		s.s4.setSid(126);
		s.s4.setSname("Abhilash Borkar ");
		s.s4.setAddress("Hingna");
		s.s4.setContact(9592946029l);
		s.s4.setGrade('B');
	
		University u = new University();
		u.displayAllStudent(s);
	}

}
