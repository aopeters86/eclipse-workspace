
public class CSC275M1Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String java = "poop is so much fun";
		System.out.println(Problem17(java));


	
		
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

		public static boolean Problem17(String phrase) {
			// Your code here
			
			String javaIn = phrase.toLowerCase();
			
		
			if(javaIn.contains("java")) {		

				return true;
			}
			
			return false;
		
	}

}
