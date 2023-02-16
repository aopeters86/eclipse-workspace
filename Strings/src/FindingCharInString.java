
public class FindingCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String favoriteMeal = "I really love good chicken wings" ;
		String favoriteDrink = "I really love to drink fancy waters";
		
		char alpha;//create char variable
		
		System.out.println(favoriteDrink);
		System.out.println(favoriteMeal);
		System.out.println();
		System.out.println(favoriteMeal.charAt(10));
		System.out.println(favoriteDrink.charAt(0));
		System.out.println();
		
		for(int i=0; i<=favoriteDrink.length()-1; i++) {
			System.out.print(favoriteDrink.charAt(i));
		}
		System.out.println();
		
		for(int i=0; i<favoriteDrink.length(); i++) {
			System.out.print(favoriteDrink.charAt(i));
		}
		
		alpha = favoriteDrink.charAt(7);
		System.out.println("\n");
		System.out.println(alpha);
		
	}

}
