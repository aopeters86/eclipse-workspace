import java.util.*;

public class CountDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter some numbers to compare which is lowest and highest (Input ends with 1776): ");

		
		
		CountDown2 CountDown2Class = new CountDown2();
		CountDown2Class.max
		
		//		ArrayList<Integer> number  = CountDown2.fill();
//		CountDown2.max(number);
//		CountDown2.min(number);
//		
//		System.out.println("Maximum number is: "  + CountDown2.max(number));
//		System.out.println("Minimum number is: " + CountDown2.min(number));
		//System.out.println(mostOccuring(number));
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
//	public static ArrayList<Integer> fill() {
//		ArrayList<Integer> number = new ArrayList<>();
//		Scanner input = new Scanner(System.in);
//		
//		int value;
//		do {
//			value = input.nextInt();//read value from input
//			if(value!=1776) {
//				number.add(value);
//			}
//			if(value == 1776) 
//				break;			
//			}
//		while(value !=1776);
//		input.close();
//		
//		return number;
//		
//	} 
//	
//
//	public static int max(ArrayList<Integer> array) {
//		int max = 0;
//		int arraySize = array.size();//put array into an int for loop
//		Collections.sort(array);//sort the array
//		for(int i = 0; i < arraySize; i++) {
//			array.get(i);
//			max = array.get(arraySize - 1);
//		}
//		return max;//can only return one per method???
//	}
//
//	public static int min(ArrayList<Integer> array) {
//		int min = 0;
//		int arraySize = array.size(); //put array into an int for loop
//		Collections.sort(array);
//		for(int i = 0; i < arraySize; i++) {
//		array.get(i);
//			min = array.get(0);
//	}
//		return min;
//	}
}
//not functional yet
//	public static int mostOccuring(ArrayList<Integer> array) {
//		int count = 0;
//		int arrayOcc = array.size();
//		for(int i = 0; i < arrayOcc; i++) {
//		if(arrayOcc == i) {
//			count++;
//		}
//	}
//	
//	return count;
//	}
//		This is a program that takes numbers from user input, and shows the min and max number, with a floor of zero, which cant be used. if zero is entered, 
//		java will ignore it
//		exit condition will be 1776


//		add exception handling
		
//		int count = 0;  create another method to return the count?
//				count++;
	

////		int temp = input.nextInt();
//
//do {	
//}
//while (temp!= 1776) ;
	
	
	
	
	//Can this be put into a method? for cleanliness.....
//		System.out.println(arrayIn());
//		arrayIn();
//}
//	
//	public static void arrayIn(Scanner in) {
//		ArrayList<Integer> number = new ArrayList<>();
//		Scanner input = new Scanner(System.in);
//		
//		int value;
//		do {
//			value = input.nextInt();//read value from input
//			if(value!=1776) {
//				number.add(value);
//			}
//			if(value == 1776) 
//				break;			
//			}
//		while(value !=1776);
//		
//	}



//		int value;// this variable has to be here for the while part below
//		do{value = input.nextInt();//read value from input
//			if(value!=1776 && value !=0){number.add(value);}
//			if(value == 1776)break;}while(value !=1776);
//		
//		System.out.println(number.toString()); //format to not print the brackets