
import java.util.*;

public class StudentMethods1 {
	public void addItem(String cargohold[]) {
		// TODO: Add an item that is specified by the user
		Scanner input = new Scanner(System.in);
		String userIn = "";
			int totalEmpty = 0; 
			
			for(int i = 0; i < cargohold.length; i++) {
				if(cargohold[i] == null || cargohold[i] == "empty" || cargohold[i] == "") {
					totalEmpty++; 	
					
				}
			}
			if(totalEmpty == 0){//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx
				System.out.println("Inventory full, remove an item from inventory");
			}
			System.out.println("Inventory spots available: " + (totalEmpty) + "\n");
//			System.out.println("");
			
//			was trying to get empty response before figure this out
			do{	
//					}
				System.out.println("Enter an item or 0 to return to main: ");
				System.out.println("");
				userIn = input.nextLine();
				
//				System.out.println(userIn);
				if(!userIn.equals("0")) {
					
					for(int i = 0; i < cargohold.length; i++) {
						if(cargohold[i] == null || cargohold[i] == "empty" || cargohold[i] == "") {
							cargohold[i] = userIn;
							totalEmpty--;
							//this prints zero and breaks out of loop
							System.out.println("Inventory Spots Available: " + totalEmpty + "\n");
							break;}}}
				}while(totalEmpty != 0 && !userIn.equals("0"));
			
			for (int i =0; i < cargohold.length; i++) {
			if (cargohold[i].equals("") || cargohold[i].equals(null) || cargohold[i].equalsIgnoreCase("empty")) {
				cargohold[i] = "empty";
					}
				}
			}
	
	public void removeItem(String cargohold[]) {
		Boolean didRemove = false;
		// TODO: Remove an item that is specified by the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the item to remove");
		System.out.println("");
		String remove = input.nextLine();

		for( int i = 0; i < cargohold.length; i++ ) {	
			if(remove.equalsIgnoreCase(cargohold[i])) {
				cargohold[i] = "empty";
				didRemove = true;
			}
		}
		if(didRemove) System.out.println(remove + " Has been removed from inventory\n");
		
		else System.out.println(remove + "is not a valid entry, item was not found in inventory\n");
}

	public void sortItems(String cargohold[]) {
		// TODO: Sort the items in the cargo hold (No need to display them here) - Use
		for (int i =0; i < cargohold.length; i++) {
			if (cargohold[i].equals("") || cargohold[i].equals(null) || cargohold[i].equalsIgnoreCase("empty")) {
				cargohold[i] = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
			}
		}
	
		for (int i = 0; i <cargohold.length; i++) {
			if(cargohold[i] == "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz") {
				cargohold[i] = "empty";
			}
		}
		


	}

	public void searchItems(String cargohold[]) {
		// TODO: Search for a user specified item
		/*
		 * compareTo() for the whole word, if not there, throw exception to check spelling
		 */
		Boolean search = false;
		int count = 0;
		// TODO: Remove an item that is specified by the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter item to search inventory: ");
		System.out.println("");
		String userSearch = input.nextLine();
		

		for( int i = 0; i < cargohold.length; i++ ) {	
			if(userSearch.equalsIgnoreCase(cargohold[i])) {
				count++;
				search = true;
			}
		}
		if(search) System.out.println("Searched item results: " + userSearch + " - " + count + "\n");
		/*"Searched Item results: " + out + " - " + count + "\n"*/
		
		else System.out.println(userSearch + "is not a valid entry, item was not found in inventory, check spelling");
}
		
	


	public void displayItems(String cargohold[]) {
		// TODO: Display only the unique items along with a count of any duplicates
		// For example it should say
		// Food - 2
		// Water - 3
		// Ammunition - 5
		
		//change to if empty dont display it 
		
		String[] arrSearch = new String[cargohold.length];
		
		Arrays.sort(cargohold);
		
		String item = cargohold[0];
		String out = "";
		int count = 0; 
		

		
		for (int i =0; i < cargohold.length; i++) {

			if(cargohold[i].equals(item)) {
				count++;
				out = item;
		
		}
			else {
				System.out.println(out + " - " + count);
				out = cargohold[i];
				item = cargohold[i];
				count = 1;
			}
			
			if(i == cargohold.length-1) {
				System.out.println(out + " - " + count +"\n");
			}
		}
	}
			 
}



//		May need somewhere .equalsignorecase
//		String[] noNullCargohold = cargohold;
//
//		for(int i = 0; i < cargohold.length; i++) {
//			if(cargohold[i] == null || cargohold[i] == "") {
//				cargohold[i] = "empty";
//				noNullCargohold = cargohold;
//			}

//this is search 
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter an item to search in inventory\n");
//		String userIn = input.nextLine();
//		
//		int count = 0;
//		String out = "";
//		String item = userIn;
//		
//		for(int i = 0; i < cargohold.length; i++) {
//			if(cargohold[i].equalsIgnoreCase(item)) {
//				count++;
//				out = item;
//		}
//
//		//if item not in inventory throw check spelling
//			
//		}	
//		System.out.println("Searched Item results: " + out + " - " + count + "\n");



//			Arrays.sort(cargohold, new Comparator<String>() {
//@Override//overriding comparator
//public int compare(String s1, String s2) {
//	if(s1 == "empty"&& s2 == "empty") {
//	return 0;
//}
//	if(s1 == "empty") {
//		return 1;
//	}
//	if(s2 == "empty") {
//		return -1;
//	}
//	return s1.compareTo(s2);
//}});
////}
//System.out.println(Arrays.toString(cargohold));
//System.out.println("");

