package OverridePractice;

public class Test {

	public static void main(String[] args) {
// ClassP Object 
		ClassP p = new ClassP();
		System.out.println(" ");
		System.out.println(" =============== ClassP Method =============== ");
		p.m1();
		p.m2();
		p.m3();
		p.m4();
		p.m5();
		
		
		ClassP p1 = new ClassQ();
		System.out.println(" ");
		System.out.println(" =============== ClassQ Method =============== ");
		p1.m1();
		p1.m2();
		p1.m3();
		p1.m4();
		p1.m5();
		
		ClassP p2 = new ClassR();
		System.out.println(" ");
		System.out.println(" =============== ClassR Method =============== ");
		p2.m1();
		p2.m2();
		p2.m3();
		p2.m4();
		p2.m5();
		
		ClassQ q = new ClassQ();
		System.out.println(" ");
		System.out.println(" =============== ClassQ  Methods =============== ");
		q.m1();
		q.m2();
		q.m3();
		q.m4();
		q.m5();
		q.m6();
		q.m7();
		q.m8();
		
		ClassQ q1 = new ClassR();
		System.out.println(" ");
		System.out.println(" =============== ClassR Method =============== ");
		q1.m1();
		q1.m2();
		q1.m3();
		q1.m4();
		q1.m5();
		q1.m6();
		q1.m7();
		q1.m8();
	
	}

}
