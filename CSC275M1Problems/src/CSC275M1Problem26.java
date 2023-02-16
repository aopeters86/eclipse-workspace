
public class CSC275M1Problem26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double out = 16.32;
		System.out.println(Problem26(out));

	}
	
	/**
	 * Problem 26
	 * 
	 * Write a method that will take in a double value and round it to the nearest
	 * whole number. Return this number as an integer.
	 */
	public static int Problem26(double number) {
		// Your code here
		
		int round = (int) Math.round(number);
		
		return round;
	}

}
