import java.util.Arrays;

public class CSC275Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []  arr11 = {"Baseball","Football",null, null, "Soccer",null, "Paintball",
				  null};
		
		
		System.out.println(Arrays.toString(Problem11(arr11)));
	}
	
	/**
	 * Problem 11
	 * 
	 * You are given an array that is partially filled with Strings. These strings
	 * will be random and are inconsequential to the problem. Some of the spots in
	 * the array will be empty (null). Your job is to traverse the array and move
	 * all null items to the end of the array. Once this is done, return the array.
	 * 
	 * Example Input: {"Baseball","Football",null, null, "Soccer",null, "Paintball",
	 * null}
	 * 
	 * Example Output: {"Baseball", "Football", "Soccer", "Paintball", null, null,
	 * null, null}
	 */
	public static String[] Problem11(String[] myArray) {
		// Your code here
		
		String a = "";
		int count = 0;
		int b = myArray.length;
		String[] arr11 = new String[myArray.length];

		
		
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] != null) {
				arr11[count++] = myArray[i];
				
			}
		 while(count < b) {
			 arr11[count++] = null;
		 }
			
	
	

	}
		return arr11;
	}
}


