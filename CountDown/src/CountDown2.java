import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountDown2 {
	private ArrayList<Integer> usersNumbersList = fill();
	private int max;
	private int min;
	
	
public CountDown2() {
	
//	ArrayList<Integer> usersNumbersList = fill();
	usersNumbersList = fill();
	max = max();
	min = min();

}

public int GetMax() { return max;}
public int GetMin() {return min;}
public void SetMax(int newMax) {max = newMax;}
	
	//give this class state to take ownership
	public  ArrayList<Integer> fill() {	//fill array
 		ArrayList<Integer> usersNumbersList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		int value;
		do {
			value = input.nextInt();//read value from input
			if(value!=1776) {
				usersNumbersList.add(value);
			}
			if(value == 1776) 
				break;			
			}
		while(value !=1776);
		input.close();
		
		return usersNumbersList;
		
	} 
	
	public int max() {
		int max = 0;
		int arraySize = usersNumbersList.size();//put array into an int for loop
		Collections.sort(usersNumbersList);//sort the array
//		for(int i = 0; i < arraySize; i++) {
//			array.get(i);
			max = usersNumbersList.get(arraySize - 1);
			System.out.println("Maximum number is: " + max);//can only return one per method???
		return max;
	}
//	}
	public int min() {
		int min = 0;
		int arraySize = usersNumbersList.size(); //put array into an int for loop
		Collections.sort(usersNumbersList);
//		for(int i = 0; i < arraySize; i++) {
//		array.get(i);
			min = usersNumbersList.get(0);
			System.out.println("Minimum number is: " + min);
			return min;
	}
	}


//	}


