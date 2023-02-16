
public class CSC275M1Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String java = "Java is so much fun";
		System.out.println(Problem16(java));


	
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

	public static boolean Problem16(String phrase) {
		// Your code here
				
		String java = "Java";
		
		if(phrase.substring(0, 4).equalsIgnoreCase(java)) {		

		return true;
	}
	
	return false;

	}
	}