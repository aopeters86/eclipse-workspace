import java.util.*;
public class CountHighLow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int userIn = input.nextInt();
		
		int max = 0;
		int min = 0;
		int temp = 0;
		
		do {
			if(userIn > temp) 
				min = userIn;
				temp = min;
			
			if (userIn > min)
			min = userIn;
		
			
		userIn = input.nextInt();
		}
		while(userIn != 0);

	}

}

//3
//6
//5
//2
//1
//3
//6
//5
//0
