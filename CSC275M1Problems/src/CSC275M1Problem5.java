
public class CSC275M1Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr5 = new int[]{1, 8, 7, 6, 7, 1, 7, 9, 7, 2};
		System.out.println(Problem5(arr5));

	}
	/**
	 * Problem 5
	 * 
	 * Write a method that accepts an array of ints that has been filled with a
	 * random number between 1-10 at each index. Your method should count the number
	 * of times that the number 7 appears in the array. Return this value.
	 */
	public static int Problem5(int[] myArray) {
		// Your code here
		
		int count = 0;
		
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] == 7){
				count++;
			}
		}
		
		return count;
	}

}
