import java.util.Scanner; 
public class testOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine(); 
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine(); 
		
		
		char c1 = Character.toUpperCase(city1.charAt(0));
		char c2 = Character.toUpperCase(city2.charAt(0));
		char c3 = Character.toUpperCase(city3.charAt(0));
		
		
		
		
		
		if ((city1.compareToIgnoreCase(city2) < 0) && (city1.compareToIgnoreCase(city3) < 0)){
			System.out.println("The cities in alphabetical order are: ");
		}
		
		//&& (city1.compareToIgnoreCase(city3) > 0 ))
		
		
		/*if (c1 < c2 && c1 < c3 && c2 < c3) {
			System.out.println("The cities in aplhabetical order are " + city3 + city2 + city1);//cba
		}*/
		
		/* if (c2 < c1 && c2 < c3 && c1 < c3) {
			System.out.println("The cities in aplhabetical order are " + city3 + city1 + city2);
		}
		 */
		 
		/*
		else if (c1 < c2 && c1 < c3 && c2 < c3) {
			System.out.println("The cities in aplhabetical order are " + city3 + city2 + city1);
		}*/
		
		
					
		/*
		 * if ('A' >= 65)
		
		{	
			int value1 = c1 + 0;
			int value2 = c2 + 0;
			int value3 = c3 + 0;
		}
		*/
		
			/*
			System.out.println(value1);
			System.out.println(value2);
			System.out.println(value3); */
			
		
		//System.out.println( c2 < c1);
	
		
		/*
		if (= c2) { 
			System.out.println("The cities in alphabetical order are: " + city1 + ", " + city2);
			
		}
		
		*/
		
		
		
		//System.out.println('A' < 66); //returns true
		//System.out.println('A'> 66);
		//System.out.println('A');
		/*
		 * if (c1 < c2 || c2 < c3) {
			
			System.out.print("The cities in alphabtetical order are " + city1 +", " + city2);
			
		}
		*/
		/*
		if (c1 < c2 && c1 < c3 && c2 < c3) {//if 1 less than 2 and 2 less than 3  
			
			System.out.println("The cities are " + city3 +city2 +city1);
			
		}
		*/
		
		//System.out.println(city1);
		
		
	}

}


//65-90 A-Z unicode