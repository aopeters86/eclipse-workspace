import java.util.Arrays;
public class CSC275M1Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(Problem3()));
	}
	
	/**
	 * Problem 3
	 * 
	 * Write a program that creates an array of length 100, and fills it with only
	 * numbers that are multiples of 3 or 5 (3,5,6,9,10,12,15 ...). Once this is
	 * done, return the array
	 */

	public static int[] Problem3() {
		// Your code here
		
		int n=3;
		int[] arr3 = new int[100];

		
		for(int i = 0; i < arr3.length; i++) {
			if(n % 3 == 0 || n % 5 == 0) {
			arr3[i] = n;
			n++;
		}
			else {
				n++;
				i--;
			}
		
	
		}	
		return arr3;	
	}	
}

