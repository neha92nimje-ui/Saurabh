package Tasks;

public class University {
	
	public void m1() {
		int i,j;
		for(i = 1 ; i<=5; i++) {
			for(j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	public void displaySingleStudent(Student s) {
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		System.out.println(s.getAddress());
		System.out.println(s.getContact());
		System.out.println(s.getGrade());
	}
	public void displayAllStudent(AllStudent as) {
		System.out.println(as.s1.getSid());
		System.out.println(as.s1.getSname());
		System.out.println(as.s1.getAddress());
		System.out.println(as.s1.getContact());
		System.out.println(as.s1.getGrade());
		
		System.out.println(as.s2.getSid());
		System.out.println(as.s2.getSname());
		System.out.println(as.s2.getAddress());
		System.out.println(as.s2.getContact());
		System.out.println(as.s2.getGrade());

		System.out.println(as.s3.getSid());
		System.out.println(as.s3.getSname());
		System.out.println(as.s3.getAddress());
		System.out.println(as.s3.getContact());
		System.out.println(as.s3.getGrade());

		System.out.println(as.s4.getSid());
		System.out.println(as.s4.getSname());
		System.out.println(as.s4.getAddress());
		System.out.println(as.s4.getContact());
		System.out.println(as.s4.getGrade());
	}

	public static void main(String[] args) {
		College c = new College();
		c.addSingleStudent();
		c.addAllStudent();
		University u = new University();
		u.m1();
	}
}
