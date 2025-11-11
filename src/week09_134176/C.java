package week09_134176;






public class C implements a, b{
	public void displayA() {
		System.out.println("Display A");
	}
	
	public void displayB() {
		System.out.println("Display B");
	}
	
	public static void main(String[] args) {
	
		C c = new C();
		c.displayA();
		c.displayB();
	}
	
}
