import java.util.Scanner;
public class arraysBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grades[] = {96.5,98.7,99.3,88.4,88.6,99.9};
		//int numbers[] = new int[10];//declare array
		
		//variable to hold highest value
		double max;
		//start somewhere, assign max value to grades 0,
		//has to be done to initialize
		max = grades[0];
		
		int i;
		
		// who had the highest grade
		for(i = 0; i<=5; i++) {
			
			//checking to see if new elelement checking is 
			//bigger than one we checked
			if(grades[i] > max) max = grades[i];			
		}
		
		System.out.println("The max grade in the class is: " + max);
		
		
	}
}

//		int age[] = {0,1,2};
//		double height[] = {4.7, 2.7, 6.7};
//		
////		height[0] = 4.7;
////		height[1] = 2.7;
////		height[3] = 6.7;
//		
//		System.out.println("The first height is: "+height[0]);
//		System.out.println("The first height is: "+height[1]);
//		System.out.println("The first height is: "+height[2]);
//		
//		
//		
////		age[0] = 0;
////		age[1] = 1;
////		age[2] = 2;
//		
//		System.out.println(age[0]);
//		System.out.println(age[1]);
//		System.out.println(age[2]);
//
//	
//	//////////////////////////////////////////////
//	
//		//store numbers plus 10 into numbers
//		for (i = 0; i<=9; i++) {
//			numbers[i] = i + 0;
//		}
//		
//		for (i = 0; i <= 9 ; i++) {
//			System.out.println(numbers[i]);
//		}


//		for(i = 0; i <= 5; i++)
//		{
//		System.out.println("Grade number " + i + " is " + grades[i]);
//		}