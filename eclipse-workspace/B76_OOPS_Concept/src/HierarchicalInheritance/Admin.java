package HierarchicalInheritance;

public class Admin {

	public static void main(String[] args) {
		ClassX X = new ClassX();
		System.out.println(X.i);
		X.m1();
		
		
		ClassY y = new ClassY();
		System.out.println(y.i);
		System.out.println(y.j);
		y.m1();
		y.m2();
		
		
		ClassZ z = new ClassZ();
		System.out.println(z.i);
		System.out.println(z.k);
		z.m1();
		z.m3();
		
		
		
		
		
	}
}
