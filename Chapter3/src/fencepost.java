import java.util.*;

public class fencepost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner console = new Scanner (System.in);
		System.out.print("Your max list of numbers? ");
		int number = 0;
		while (number != -1) {
			System.out.println("(-1 to exit!)");
			number = console.nextInt();
			numberList(number);
			if (number != -1) {
				System.out.print("Next number? ");
			}
		}
		System.out.println("Terminated");
		
	}
	public static void numberList(int max) {
		for (int i = 1; i <= max - 1; i++) {
			if (i == 1) {
				System.out.print("The numbers are ");
			}
			System.out.print(i + ",");
		}
		if (max > 0) {
			System.out.print(max);
			System.out.println();
		}
		else if (max == 0) {
			System.out.println("The numbers don't exist!");
		}
		else {
			System.out.println();
		}
		
	}

}
