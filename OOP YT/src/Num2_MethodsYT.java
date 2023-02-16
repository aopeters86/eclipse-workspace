import java.util.Scanner;
public class Num2_MethodsYT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//vreate variable to hold user input
		int number =1;
		
		System.out.println("Please enter a season (1 = Spring," 
		+"2 = Summer, 3 = Fall, 4 = Winter)");
		number = input.nextInt();
		
		
		if(number == 1) {
		printSpring();
		}
		else if (number == 2) {
			printSummer();
		}
		else if(number == 3) {
			printFall();
		}
		else {
			printWinter();
		}
	}
	
	public static void printSpring(){
		System.out.println("It's spring, welcome to mud");
				
	}
	
	public static void printSummer(){
		System.out.println("It's Summer, it's hot and humid");
	}
	
	public static void printFall() {
		System.out.println("It's Fall, it is my favorite season, unfortunately it is also pumpkin spice season, which is gross!");
		
	}
	
	public static void printWinter(){
		System.out.println("It's winter, time for snow and cold.");
	}

}
