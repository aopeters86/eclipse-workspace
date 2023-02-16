
public class isPerfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A square of squares

Task
Given an integral number, determine if it's a square number:

In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, 
it is the product of some integer with itself.
Examples
-1  =>  false
 0  =>  true
 3  =>  false
 4  =>  true


		 */
		
		
		int in = 4;
		System.out.println("Is this number square? " + isSquare(in) );
	}
    
public static boolean isSquare(int n) {
	
	return Math.sqrt(n) % 1 ==0 ? true : false;
		
//		return false;
		
//		return false; // fix me!
		    }
		

	}


