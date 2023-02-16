import java.util.Scanner;

public class ExMethods12_20_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner input = new Scanner(System.in);
		
		int num1 = 1;
		int num2 = 1;
		int largeNum1 = 1;
		System.out.println("Enter a number from 1 to 100");
		num1 = input.nextInt();
		
		System.out.println("Enter a second number from 1 to 100");
		num2 = input.nextInt();
		
		compareNum(num1, num2);
		
		largeNum1 = compareNumInt(num1, num2);//this needs to be stored after the input.nextInt
		System.out.println("Below uses the return int method");
		System.out.println(largeNum1);
	}
	
	public static void compareNum(int x, int y) {
		
		while((x >= 1 && x <= 100) 
				&& (y >=1 && y <=100))
		if (x > y) {
			System.out.println("number 1 is greater than number 2, and the greater number is " + x);
		break;
		}
		else {
			System.out.println("number 2 is greater than number 1, and the greater number is " + y);
			break;
		}
		
	}
	
	public static int compareNumInt(int x, int y) {
		
		if(x > y) {
			return x;
		}
		else {
			return y;
		}
		
	}
}
