package basicDay1;

public class StaticDemo {

	/**
	 * defining static variables
	 */
	static int a = 10;
	static long b = 2482;

	/**
	 * 
	 * defining static method
	 */
	static void display() {
		System.out.println("Static method");
	}

	/**
	 * 
	 * static block
	 */
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		display();

	}
}
