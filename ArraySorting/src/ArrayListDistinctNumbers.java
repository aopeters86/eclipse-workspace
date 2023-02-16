import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDistinctNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Something: ");
		
		int value;
		
		do {
			value = input.nextInt(); //read a value from the input
				list.add(value);//add value if it not in the list
		}
			while(value !=0);
			
			for(int i = 0; i<list.size(); i++)
				System.out.print(list.get(i) + " ");
		}
		
	}



//if(!list.contains(value) && value!=0)