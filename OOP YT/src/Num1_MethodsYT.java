
public class Num1_MethodsYT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pgm Starts \n");
		
		//method call 
		printFirstName();
		printLastName();
		addNames();
		
		System.out.println("\nPgm Ends.");

	}
	
	//task that need to be performed draw rectangle
	
	//void = no return(true or false) 
	//- if int or double, this will return int or double back
	
	public static void printFirstName(){
		System.out.println("My first name is Jeremy");	
	}
	
	public static void printLastName() {
		System.out.println("Peters");
	}
	
	public static void addNames() {
		//create local variables
		//instantiate the program
		int jeremy = 6;
		int peters = 6;
		//create a variable to hold the answer
		int sum;
				sum = jeremy + peters;
		
		System.out.println(sum);
	}
	

}
