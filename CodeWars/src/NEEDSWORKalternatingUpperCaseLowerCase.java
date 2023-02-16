import java.util.*;
public class NEEDSWORKalternatingUpperCaseLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Define String.prototype.toAlternatingCase (or a similar 
		 * function/method such as to_alternating_case/toAlternatingCase/ToAlternatingCase
		 *  in your selected language; see the initial solution for details) 
		 *  such that each lowercase letter becomes uppercase and each uppercase 
		 *  letter becomes lowercase. For example:
		 *  
		 */
		
		String a = "Bobbb";
		
//	System.out.println();
		
		System.out.println(toAlternativeString(a));

	}
	  
	  public static String toAlternativeString(String string) {
		  
		  String strIn = "";
		  char[] arr = string.toCharArray();

		  for(int i =0; i< arr.length; i++) {
			  if (Character.isLowerCase(i)){
				  strIn += Character.toUpperCase(i);
			  }
			  if (Character.isUpperCase(i)) {
				  strIn += Character.toLowerCase(i);
			  }
			  
		  }
		return strIn;
	  }
}
	
