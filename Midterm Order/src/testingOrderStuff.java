
import java.util.Scanner;
public class testingOrderStuff {
	
	public static void main(String[] args) {

	// TODO Auto-generated method stub
		
		//Order cities cant use loop
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the first city: ");
	String city1 = input.nextLine();
	System.out.print("Enter the second city: ");
	String city2 = input.nextLine(); 
	System.out.print("Enter the third city: ");
	String city3 = input.nextLine();
	
	String temp = "";
	String temp2 = "";
	String temp3 = "";
	
	if(city1.compareToIgnoreCase(city2) < 0 ){
		temp = city2;
		city2 = city1;
		city1 = temp;
	}
		
	else if(city2.compareToIgnoreCase(city3) < 0 ){
		temp = city1;
		city1 = city2;
		city2 = temp;
		
		}
	else if(city3.compareToIgnoreCase(city2) < 0){
		temp = city3;
		city3 = city2;
		city2= temp;
	}
	
//	else {
//		System.out.println("The cities in order are: " + city1 + ", " + city2 + ", " + city3);
//		}
	
	
	System.out.println("The cities in order are: " + city1 + ", " + city2+ ", " + city3);
	}
	
}
