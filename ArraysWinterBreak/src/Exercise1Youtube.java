
public class Exercise1Youtube {
	public static void main (String[]args ){
	
	// loop thru 100 elements and store square of it, print out array 
	
	int squares[] = new int[100];
	
	int i;
	
	for(i= 0; i<99; i++) {
		//for every value it's stored as its square
		squares[i]= i*i;
	}
	
	for (i = 0; i < 99; i++) {
		System.out.println("The square of " 
				+ i + " is " + squares[i]);
	}
	
	
	}
}

