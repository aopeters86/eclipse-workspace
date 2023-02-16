
public class isEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * In this Kata we are passing a number (n) into a function.

Your code will determine if the number passed is even (or not).

The function needs to return either a true or false.

Numbers may be positive or negative, integers or floats.

Floats with decimal part non equal to zero are considered UNeven for this kata.

even = divisible by 2
odd is not divisible by 2
		 */

		
		long a = 22;
		
		System.out.println(a % 2);
		System.out.println(even(a));
		
	}
	
	public static boolean even(long a) {
		
		
	if (a % 2 == 0) {
		return true;
	}
	return false;
		
	}
	
}
