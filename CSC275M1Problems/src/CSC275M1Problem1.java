import java.util.Arrays;

public class CSC275M1Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		System.out.println(Arrays.toString(Problem1(a)));

	}
	
	/**
	 * Problem 1
	 * 
	 * Write a program that creates an array of length n, and fills it with
	 * numbers (0-99) according to the index of each array. Once this is done,
	 * return the array
	 */

	public static int[] Problem1(int n) {
		// Your code here
		//use arr1 for problem 1
		int [] arr1 = new int[n];
		
		for(int i = 0; i< arr1.length; i++) {
			arr1[i] = i ;
			
		}
		return arr1;
	}

}
