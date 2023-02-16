import java.util.Scanner;

public class loopCheckCharorDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//check if theres anything other than char or digits in this
		
		
		Scanner keyboard = new Scanner(System.in);

		
		System.out.println("Enter string no special chars: ");
		String userIn = keyboard.nextLine();
		
	
		
		if(userIn.length() < 8) {
			
			System.out.println("Under 8 no good");
		}
			else {
				System.out.println("string valid");
			
		}
		 
		
		for(int i = 0; i < Character.isLetterOrDigit(userIn.charAt(i)); i++)	{
			System.out.print("print something0");
		}
		System.out.println("Shouldnt this work?");
	}

}
