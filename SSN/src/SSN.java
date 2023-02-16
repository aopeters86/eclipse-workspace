import java.util.Scanner;
public class SSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a SSN: ");
		String ssn1 = input.nextLine();
		
		
		if(ssn1.length()!=11);	
		{
			System.out.println("Bullshit");
		}
		
		if(ssn1.charAt(3)='-' 
				&&ssn1.charAt(6)=='-');	{
			System.out.println("valid bullshit");
			}
		
		
		//char ch = Character.isDigit(ch); //= Character.isDigit(ssn1);
		//else if(Character.isDigit(ch))
		
		//int value = ch;
				//ch.charAt(ssn1.isDigit(0));
		/*if(ssN.Character.isDigit(ssn1.charAt(0))) {
			System.out.println("Bullshit");
		
		//&&(ssn1.charAt(3) = '-');
		
			if(ssn1.length()!=11){
			System.out.println("Bullshit");
		
			
			/*if(ssn1.length() !=11) {
			System.out.println( ssn1 +" is an invalid social security number");
			System.exit(0);
		}
		
		*/
			
		
		//(ssn1.charAt(3))
		
		//dashSSN = '-';
		
		//SSN is 123-45-6789
		
		//char soc1 = Character.isDigit(ssn1(11));
		
		/*if(soc1 >='A' && soc1 >='Z') {
			System.out.println(ssn1 + " is an invalid social security number");
			
		}
		*/
		
	}
}

