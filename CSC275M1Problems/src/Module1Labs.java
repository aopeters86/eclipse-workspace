import java.util.Arrays;

//package Labs.Module1;

public class Module1Labs {
	/**
	 * Problem 1
	 * 
	 * Write a program that creates an array of length n, and fills it with
	 * numbers (0-99) according to the index of each array. Once this is done,
	 * return the array
	 */
	

	public int[] Problem1(int n) {
		// Your code here
//		return null;
	int [] arr1 = new int[n];
		
		for(int i = 0; i< arr1.length; i++) {
			arr1[i] = i + 0;
			
		}
		return arr1;
	}

	/**
	 * Problem 2
	 * 
	 * Write a program that creates an array of length 100, and fills it with odd
	 * numbers starting at one and increasing until the array is full. Once this is
	 * done, return the array
	 */

	public int[] Problem2() {
		// Your code here
//		return null;
		int [] arr2 = new int[100];
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = i + (i + 1);
		}
		return arr2;
	}

	/**
	 * Problem 3
	 * 
	 * Write a program that creates an array of length 100, and fills it with only
	 * numbers that are multiples of 3 or 5 (3,5,6,9,10,12,15 ...). Once this is
	 * done, return the array
	 */

	public int[] Problem3() {
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

	public int[] Problem4() {
		// Your code here
		return null;
	}

	/**
	 * Problem 5
	 * 
	 * Write a method that accepts an array of ints that has been filled with a
	 * random number between 1-10 at each index. Your method should count the number
	 * of times that the number 7 appears in the array. Return this value.
	 */
	public int Problem5(int[] myArray) {
		// Your code here
	int count = 0;
		
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] == 7){
				count++;
			}
		}
		
		return count;
	}

	/**
	 * Problem 6
	 * 
	 * You are given 2 different arrays of the same size that are filled with
	 * numbers.
	 * 
	 * Write a method that joins these two arrays together. Every item from the
	 * first array should be the first half of your new array, and every item of the
	 * second array should be the second half of your new array. Once this is done,
	 * return the array.
	 */

	public int[] Problem6(int[] firstArray, int[] secondArray) {
		// Your code here
		
		
		
		
		return null;
	}

	/**
	 * Problem 7
	 * 
	 * You are given 2 different arrays of the same size that are filled with
	 * numbers.
	 * 
	 * Write a method that merges these two arrays together. Every item from the
	 * first array should be in the even indices of your new array and every item
	 * from the second array should be in the odd indices. The order of each array
	 * should be preserved. Once this is done, return the array.
	 */

	public int[] Problem7(int[] firstArray, int[] secondArray) {
		// Your code here
		return null;
	}

	/**
	 * Problem 8
	 * 
	 * You are given 2 different arrays of the different sizes that are filled with
	 * numbers.
	 * 
	 * Write a method that zips these two arrays together. Each index should
	 * alternate like the merge from problem 7, but once one array has been emptied
	 * all other elements from the non-empty array should be added consecutively.
	 * Once this is done, return the array
	 * 
	 * Example input: firstArray = {1,3,5}, secondArray = {2,4,6,8,10}
	 * 
	 * Example Output: {1,2,3,4,5,6,8,10}
	 */
	public int[] Problem8(int[] firstArray, int[] secondArray) {
		// Your code here
		return null;
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

	public int[] Problem9(int[] myArray) {
		// Your code here
		
	
		Arrays.sort(myArray);
			
		return myArray;
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

	public String Problem10(String[] myArray) {
		// Your code here
		String result = "";
		
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] != null) {
				result += " " + myArray[i];
			}
		}
		

		return result.trim();
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
	public String[] Problem11(String[] myArray) {
		// Your code here
		return null;
	}

	/**
	 * Problem 12
	 * 
	 * You are given an array of integers that is of length n. Your job is to rotate
	 * the numbers in the array one index to the right. Once this is done, return the array.
	 * 
	 * Example Input: {1,2,3,4,5}
	 * 
	 * Example Output: {5,1,2,3,4}
	 */
	public int[] Problem12(int[] myArray) {
		// Your code here
		return null;
	}

	/**
	 * Problem 13
	 * 
	 * You are given an array of integers that is of length n, and a positive
	 * integer x where x < n. Your job is to rotate the numbers in the array x
	 * indices to the right. Once this is done, return the array.
	 * 
	 * Example Input: {1, 2, 3, 4, 5}, 3
	 * 
	 * Example Output: {3, 4, 5,1, 2}
	 */
	public int[] Problem13(int[] myArray, int rotation) {
		// Your code here
		return null;
	}

	/**
	 * Problem 14
	 * 
	 * You are given an array of integers that is of length n, and a positive
	 * integer x. Your job is to rotate the numbers in the array x indices to the
	 * right. Once this is done, return the array.
	 * 
	 * Example Input: {1, 2, 3, 4, 5}, 7
	 * 
	 * Example Output: {4, 5,1, 2, 3}
	 */

	public int[] Problem14(int[] myArray, int rotation) {
		// Your code here
		return null;
	}

	/**
	 * Problem 15
	 * 
	 * You are given an array of integers that is of length n, and an integer x.
	 * Your job is to rotate the numbers in the array x indices to the right if x is
	 * positive and x indices to the left if x is negative. Once this is done, return the array.
	 * 
	 * Example Input: {1, 2, 3, 4, 5}, 7
	 * 
	 * Example Output: {4, 5,1, 2, 3}
	 * 
	 * 
	 * 
	 * Example Input: {1, 2, 3, 4, 5}, -2
	 * 
	 * Example Output: {3, 4, 5,1, 2}
	 */
	public int[] Problem15(int[] myArray, int rotation) {
		// Your code here
		return null;
	}

	/**
	 * Problem 16
	 * 
	 * Write a method that accepts a large string. This method will return true if
	 * the string starts with the word "Java". This word can be any variation with
	 * uppercase or lowercase letters.
	 * 
	 * java Java jAva jaVa javA JAva JaVa JavA jAVa jAvA jaVA JAVa JaVA jAVA JAVA
	 * are all of the possibilites.
	 */

	public boolean Problem16(String phrase) {
		// Your code here
		String java = "Java";
		
		if(phrase.substring(0, 4).equalsIgnoreCase(java)) {		

		return true;
	}
	
	return false;

	}

	/**
	 * Problem 17
	 * 
	 * Write a method that accepts a large string. This method will return true if
	 * the string contains the word "Java". This word can be any variation with
	 * uppercase or lowercase letters.
	 * 
	 * java Java jAva jaVa javA JAva JaVa JavA jAVa jAvA jaVA JAVa JaVA jAVA JAVA
	 * are all of the possibilities.
	 */

	public boolean Problem17(String phrase) {
		// Your code here
		String javaIn = phrase.toLowerCase();
		
		
		if(javaIn.contains("java")) {		

			return true;
		}
		
		return false;
	}

	/**
	 * Problem 18
	 * 
	 * Write a method that accepts a large string. This method will return true if
	 * the string starts with or ends with the word "Java". This word can be any
	 * variation with uppercase or lowercase letters.
	 * 
	 * java Java jAva jaVa javA JAva JaVa JavA jAVa jAvA jaVA JAVa JaVA jAVA JAVA
	 * are all of the possibilities.
	 */

	public boolean Problem18(String phrase) {
		// Your code here
		return false;
	}

	/**
	 * Problem 19
	 * 
	 * Write a program that returns true if two given strings are nearly identical.
	 * Nearly identical means that either all of their characters match, or all but
	 * one match. The strings can be upper or lower case and still be considered
	 * nearly identical. Both strings will also need to be the same length to be
	 * considered nearly identical.
	 */

	public boolean Problem19(String phrase1, String phrase2) {
		// Your code here
		return false;
	}

	/**
	 * Problem20
	 * 
	 * Write a program that accepts two different strings and returns the number of
	 * characters that are different. Either string can be null, or of any length.
	 * 
	 * If one string is null and the other is not, all of the characters are
	 * different.
	 */

	public int Problem20(String phrase1, String phrase2) {
		// Your code here
		return 0;
	}

	/**
	 * Problem 21
	 * 
	 * Create a program that decodes messages. The messages will be encoded using a
	 * Caesar cypher, with each letter being decoded by replacing it with the
	 * previous letter in the alphabet. (Supposedly, this was invented by Julius
	 * Caesar.)
	 * 
	 * The message: J MPWF KBWB would be decoded as I LOVE JAVA.
	 */
	public String Problem21(String phrase) {
		// Your code here
		return null;
	}

	/**
	 * Problem 22
	 * 
	 * Create a program that encodes messages. The messages will be encoded using a
	 * Caesar cypher, with each letter being encoded by replacing it with the next
	 * letter in the alphabet. (Supposedly, this was invented by Julius Caesar.)
	 * 
	 * The message: I LOVE JAVA would be decoded as J MPWF KBWB .
	 */
	public String Problem22(String phrase) {
		// Your code here
		return null;
	}

	/**
	 * Problem 23
	 * 
	 * Create a program that encodes messages. The messages will be encoded by using
	 * a shift that will be given to you. This shift number can be positive,
	 * negative, or zero and has no size limit.
	 */
	public String Problem23(String phrase, int shift) {
		// Your code here
		return null;
	}

	/**
	 * Problem 24
	 * 
	 * Write a method that will take in a double value and round it down to the
	 * nearest whole number and return it as an integer.
	 */
	public int Problem24(double number) {
		// Your code here
		return 0;
	}

	/**
	 * Problem 25
	 * 
	 * Write a method that will take in a double value and round it up to the nearest
	 * whole number and return it as an integer.
	 */
	public int Problem25(double number) {
		// Your code here
	int roundUp = (int)(Math.ceil(number));
		
		return roundUp;
	}

	/**
	 * Problem 26
	 * 
	 * Write a method that will take in a double value and round it to the nearest
	 * whole number. Return this number as an integer.
	 */
	public int Problem26(double number) {
		// Your code here
		int round = (int) Math.round(number);
		
		return round;
	}

	/**
	 * Problem 27
	 * 
	 * Write a method that returns true if a given number is a multiple of 3 or 5
	 * 
	 */

	public boolean Problem27(int number) {
		// Your code here
		return false;
	}

	/**
	 * Problem 28
	 * 
	 * Write a method that returns true if a given number is a multiple of 3 or 5,
	 * but not both.
	 */
	public boolean Problem28(int number) {
		// Your code here
		return false;
	}

	/**
	 * Problem 29
	 * 
	 * Write a method that accepts 4 integers and returns true if these 4 integers
	 * are evenly spaced out (that is, they all have the same number of integers
	 * between them)
	 */

	public boolean Problem29(int a, int b, int c, int d) {
		// Your code here
		return false;
	}

	/**
	 * Problem 30
	 * 
	 * Given an array of integers determine if a "mirror" exists within the array. A
	 * mirror is an exact duplication of the order of numbers, but reversed. For
	 * example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3
	 * (the {1, 2, 3} part). Your method should return the size of the largest
	 * mirror section found in the given array.
	 */
	public int Problem30(int[] myArray) {
		// Your code here
		return 0;
	}
}
