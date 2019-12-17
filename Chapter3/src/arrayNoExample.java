
public class arrayNoExample {
	public static void main (String [] args) {
		int [] list = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 7, 8, 100, 1258};
		
	}
	//long approach of finding the location of a value
	//can't return -1 either
	public static int indexOfWhile (int [] list, int target) {
		int i = 0; //long and extra
		while (!(list[i] == target)) {
			i++;
		}
		return i;
	}
	
	//easier approach using traversal loops
	public static int indexOfFor (int [] list, int target) {
		for (int i = 0; i <list.length; i++) {
			if (list[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
