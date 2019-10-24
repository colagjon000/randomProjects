
public class oct23 {
	
	//-----------------------------------------------
	//Changes character to replace darkened sections
	public static final String SYMB = "%";
	//-----------------------------------------------
	//Changes Height of Pattern
	public static final int HEIGHT = 10;
	//-----------------------------------------------
	//Changes Width of Pattern
	public static final int WIDTH = 12;
	//-----------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		heightControl(HEIGHT, WIDTH, SYMB, " ");
		
	}
	public static void lineOne (String a, String b) {
		System.out.print(a + b + b + a + a + b + b + a + a + a + b + b + a + a + b + b);
	}
	public static void lineTwo (String a, String b) {
		System.out.print(a + a + b + b + a + a + b + b + a + b + b + a + a + b + b + a);
	}
	public static void top(int repeats, String a, String b) {
		for (int i = 1; i <= repeats; i++) {
			lineOne(a, b);
		}
		System.out.println();
		for (int i = 1; i <= repeats; i++) {
			lineTwo(a, b);
		}
		System.out.println();
		for (int i = 1; i <= repeats; i++) {
			lineOne(b, a);
		}
		System.out.println();
		for (int i = 1; i <= repeats; i++) {
			lineTwo(b, a);
		}
		System.out.println();
		for (int i = 1; i <= repeats; i++) {
			lineOne(a, b);
		}
		System.out.println();
		for (int i = 1; i <= repeats; i++) {
			lineTwo(a, b);
		}
		System.out.println();
		for (int i = 1; i <= repeats; i++) {
			lineOne(a, b);
		}
		System.out.println();
		for (int i = 1; i <= repeats; i++) {
			lineTwo(b, a);
		}
		System.out.println();
		for (int i = 1; i <= repeats; i++) {
			lineOne(b, a);
		}
		System.out.println();
		for (int i = 1; i <= repeats; i++) {
			lineTwo(a, b);
		}
		System.out.println();
	}
	public static void heightControl(int height, int repeats, String a, String b) {
		for (int i = 1; i <= height; i++) {
			top(repeats, a, b);
		}
	}

}
