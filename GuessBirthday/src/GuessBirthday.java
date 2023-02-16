import java.util.Scanner;
public class GuessBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String Set1 = 
				"1 3 5 7\n" +
				" 9 11 13 15\n" + 
				"17 19 21 23\n" +
				"25 27 29 31" ;
		 
		String Set2 = 
				" 2 3 6 7\n" +
				"10 11 14 15\n" +
				"18 19 22 23\n" +
				"26 27 30 31";		
		
		String Set3 = 
				" 4 5 6 7 \n" +
				"12 13 14 15\n" +
				"20 21 22 23\n" +
				"28 29 30 31";
		
		String Set4 = 
				" 8 9 10 11\n" +
				"12 13 14 15\n" +
				"24 25 26 27\n" +
				"28 29 30 31";
		
		String Set5 = 
				"16 17 18 19\n" +
				"20 21 22 23\n" +
				"25 25 26 27\n" +
				"28 29 30 31";
		
		int day  = 0;
		
		//prompt user to answer questions
		System.out.print("Is your birthday in set 1?\n ");
		System.out.print(Set1);
		System.out.print("\nEnter 0 for No and 1 for Yes");
		int answer = input.nextInt();
		
		if (answer == 1)
			day += 1;
		
		//prompt user to answer questions
		System.out.print("\nIs your birthday in set 2?\n ");
		System.out.print(Set2);
		System.out.print("\nEnter 0 for No and 1 for Yes");
		answer = input.nextInt();
				
		if (answer == 1)
				day += 2;
		
		//prompt user to answer questions
		System.out.print("\nIs your birthday in set 3?\n ");
		System.out.print(Set3);
		System.out.print("\nEnter 0 for No and 1 for Yes");
		answer = input.nextInt();
				
		if (answer == 1)
			day += 4;
		
		//prompt user to answer questions
		System.out.print("\nIs your birthday in set 4?\n ");
		System.out.print(Set4);
		System.out.print("\nEnter 0 for No and 1 for Yes");
		answer = input.nextInt();
				
		if (answer == 1)
			day += 8;
		
		//prompt user to answer questions
		System.out.print("\nIs your birthday in set 5?\n ");
		System.out.print(Set5);
		System.out.print("\nEnter 0 for No and 1 for Yes");
		answer = input.nextInt();
				
		if (answer == 1)
			day += 16;
		input.close();
		
		System.out.println("\nYour birthday is " + day +"!");
		
	} 

}
