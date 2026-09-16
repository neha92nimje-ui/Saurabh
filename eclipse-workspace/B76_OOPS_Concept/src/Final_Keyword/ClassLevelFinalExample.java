package Final_Keyword;

public class ClassLevelFinalExample {

	// Here We Write a Final Keyword Before the Class So We cannot extend this Class
	// because we Add restrictions using Final Keyword NoBody can extends this class
	// Unless and Until its Final remove 
	
	private int i;
	
	public void m1() {
		
		System.out.println("This is M1 Method ");
	}
	
	
	public void setI(int i) {
		i = i;
		
	}
	public int getI() {
		return i;
	}
	
}
