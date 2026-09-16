package OverridePractice;

public class ClassR extends ClassQ {

	@Override
	public void m3() {
		System.out.println(" =========== ClassR Overrided M3 Method =========== ");
	}

	@Override
	public void m7() {
		System.out.println(" =========== ClassR Overrided M7 Method =========== ");
	}

	@Override
	public void m8() {

		System.out.println(" =========== ClassR Overrided M8 Method =========== ");
	}
	public void m9() {
		System.out.println(" =========== ClassR M9 Method =========== ");
	}
	
	public void m10() {
		System.out.println(" =========== ClassQ M10 Method =========== ");
	}

}
