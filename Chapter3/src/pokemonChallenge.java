/*
 * Hit points stat will be 110 plus double the base stat value
 * Attack/Defense will be exactly 5 more than double its base stat values in each
 * 
 * HP 2x + 110
 * Attack 2x + 5
 * 
 * 
 */
public class pokemonChallenge {
	public static void main (String [] args) {
		
	}
	public static int attackCalc (int valueAt) {
		valueAt = (2 * valueAt) + 5;
		return valueAt;
	}
	public static int HPCalc (int valueHP) {
		valueHP = (2 * valueHP) + 110;
		return valueHP;
	}
	public static void pokemon(int attack, int HP) {
		System.out.println("");
	}
	
}
