
public class CSC275M1Problem25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double high = 12.3;
		System.out.println(Problem25(high));

	}
	
	/**
	 * Problem 25
	 * 
	 * Write a method that will take in a double value and round it up to the nearest
	 * whole number and return it as an integer.
	 */
	public static int Problem25(double number) {
		// Your code here
//		return 0;
		int roundUp = (int)(Math.ceil(number));
		
		return roundUp;
	}
}
