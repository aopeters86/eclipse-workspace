import java.util.Arrays;

public class CSC275M1Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr4 = new int[25];
		System.out.println(Arrays.toString(Problem4()));
		
		
	}
	
	/**
	 * Problem 4
	 * 
	 * Write a program that creates an array of length 25, and fills it with
	 * Fibonacci sequence until the array is full. Once this is done, return the
	 * array.
	 * 
	 * The Fibonacci sequence is the series of numbers where each number is the sum
	 * of the two preceding numbers.
	 * 
	 * Hint: The sequence starts at 0 and the last value is 46368
	 */

	public static int[] Problem4() {
		// Your code here
		
		int[] arr4 = new int[25];
		int a = 0;//starts with 0,
		int b = 1;//add 1 and 0
		int sum;//store sum
		for(int i = 2; i < arr4.length; i++) {
			sum = a + b;
			a = b;
			b = sum;
		
			arr4[i] = sum;
			
			
			
		}
		
		return arr4;
	}

}
