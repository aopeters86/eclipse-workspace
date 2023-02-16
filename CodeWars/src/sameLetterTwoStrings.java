
public class sameLetterTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String animal = "chickadee";
		String food = "chocolate";
		System.out.println(feast(animal, food));

	}
	
public static boolean feast(String beast, String dish) {
		 
	char beastFL = beast.charAt(0);
	char dishFL = dish.charAt(0);
	char beastLL = beast.charAt(beast.length()-1);
	char dishLL = dish.charAt(dish.length() -1);
	
	if(beastFL == dishFL && beastLL == dishLL) {
		return true;
	}
  
	return false;
		    
	  }
		  
}


