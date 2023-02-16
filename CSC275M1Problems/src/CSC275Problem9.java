import java.util.Arrays;
public class CSC275Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr9 = new int[] {1,2,1,2,1,2,1,2,1,2,};
		
		System.out.println(Arrays.toString(Problem9(arr9)));

	}

	/**
	 * Problem 9
	 * 
	 * You are given an array that is randomly filled with either 1's or 2's. Your
	 * job is to move all of the 1's to the start of the array, and all of the 2's
	 * to the end of the array. Once this is done, return the array.
	 * 
	 * Example input: array = {1,2,2,2,1,1,1,2,1,2}
	 * 
	 * Example Output: {1,1,1,1,1,2,2,2,2,2}
	 */

	public static int[] Problem9(int[] myArray) {
		// Your code here
		
		
		Arrays.sort(myArray);
			
		return myArray;
	}
	
}
