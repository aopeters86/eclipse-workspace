
public class arrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int largeArray[] = {8,-24,12,13,2,15,25,65,34,1,99,76,87,109,54};
		
		int smallest = largeArray[0];
		int largest = largeArray[0];
		
		for(int i = 0; i <= 13; i++) {
			
			/*
			 * logically, scan thru all, seed value if we come across an element smaller 
			 * than current value, reassign smallest value to be what we c
			 * ame acros. if something smaller is found, its reassigned.  
			 */
			if(largeArray[i] < smallest) smallest = largeArray[i];
			if(largeArray[i] > largest) largest = largeArray[i];
			
		}
		System.out.println("The smallest value in the array is: " + smallest);
		System.out.println("The largest value in the array is: " + largest);
	}

}
