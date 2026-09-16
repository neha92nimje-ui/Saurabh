package Abstraction_Example;

public class ClassB extends ClassA{
	
	@Override
	public void m1() {
	
		System.out.println("This is Abstract Class's  Overrided Method Which is Implemented in Child Class.");
		
	}
	
	public void m3() {
		
		System.out.println("This Is Child Class Method ");
	}

	public static void main(String[] args) {
		
	// parent child mix object
		
		ClassA a = new ClassB();
		a.m1();
		a.m2();
		
		
		// Child object 
		
		ClassB b = new ClassB();
		b.m1();
		b.m2();
		b.m3();
	}
	
	
}
