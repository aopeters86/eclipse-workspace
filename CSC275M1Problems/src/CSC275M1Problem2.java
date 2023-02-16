import java.util.Arrays;
public class CSC275M1Problem2 {
	
	public static void main(String[] args) {
		
		/**
		 * Problem 2
		 * 
		 * Write a program that creates an array of length 100, and fills it with odd
		 * numbers starting at one and increasing until the array is full. Once this is
		 * done, return the array
		 */
	
		System.out.println(Arrays.toString(Problem2()));
	
	}
	public static int[] Problem2() {
		// Your code here
//		return null;
		int [] arr2 = new int[100];
		
		for(int i = 0; i < arr2.length; i++) {
//			arr2[i] = (i + 1)%2; this funk prints every other index with 1 pretty cool
			arr2[i] = i + (i + 1);
		}
		return arr2;
	}

}