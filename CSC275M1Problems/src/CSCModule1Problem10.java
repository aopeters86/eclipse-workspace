import java.util.Arrays;

public class CSCModule1Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr10 = new String[]{"Baseball","Football",null, null, "Soccer",null, "Paintball", null};
		System.out.println(Problem10(arr10));
	}
	
	/**
	 * Problem 10
	 * 
	 * You are given an array that is partially filled with Strings. These strings
	 * will be random and are inconsequential to the problem. Some of the spots in
	 * the array will be empty (null). Your job is to traverse the array and save
	 * each non-null value to a string. You will then return that string from the
	 * method. If the spot in the array contains a null value, skip it completely.
	 * 
	 * Example Input: {"Baseball","Football",null, null, "Soccer",null, "Paintball",
	 * null}
	 * 
	 * Example Output: Baseball Football Soccer Paintball
	 */

	public static String Problem10(String[] myArray) {
		// Your code here
		
		
		String result = "";
		
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] != null) {
				result += " " + myArray[i];
			}
		}
		
		return result.trim();
	}

}
