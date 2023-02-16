import java.util.Scanner;

public class testThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	 
		

	
	
	
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine(); 
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine(); 
																			//if strings used used in
		System.out.println(city1.compareToIgnoreCase(city2));      // -1  means a < b  1	
		System.out.println(city1.compareToIgnoreCase(city2) < 0);  //true

		System.out.println(city1.compareToIgnoreCase(city3));      // -2	1
		System.out.println(city1.compareToIgnoreCase(city3) < -1); //true
		
		System.out.println(city2.compareToIgnoreCase(city1));	   //  1
		System.out.println(city2.compareToIgnoreCase(city1) > 0);  //
		
		System.out.println(city2.compareToIgnoreCase(city3));      // -1
		System.out.println(city2.compareToIgnoreCase(city3) < 0);  //
		
		System.out.println(city3.compareToIgnoreCase(city1));      //  2
		System.out.println(city3.compareToIgnoreCase(city1) > 1);  //true 
		System.out.println(city3.compareToIgnoreCase(city2));      //  1  
		System.out.println(city3.compareToIgnoreCase(city2) > 0 );  //
		
		
		//works alpha bravo charlie
		if ((city1.compareToIgnoreCase(city2) < 0)&&
		    (city1.compareToIgnoreCase(city3) < -1)){
			System.out.println("The cities in alphabetical order are: " + city1 + ", " + city2 + ", " + city3);
		}
		
		//
		if ((city1.compareToIgnoreCase(city2) < 0)&&
			(city2.compareToIgnoreCase(city1) > 0)){
				System.out.println("The cities in alphabetical order are: " + city2 + ", " + city1 + ", " + city3);
			}
		
	}

}
