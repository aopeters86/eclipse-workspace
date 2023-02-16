
public class OverloadMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoke max with int params
		System.out.println("The maximum of 3 and 4 is " + max(3, 4));
		//invoke max with double params
		System.out.println("The maximum of 3.0 and 4.0 is " + max(3.0, 4.0));
		//invoke max with three double params
		System.out.println("The maximum of 3.0, 5.0, and 10.14 is " + max(3.0, 4.0, 10.14));
		
		//invoke max with three double params
		System.out.println("The maximum of 3.0, 5.0, 16.3 and 10.14 is " + max(3.0, 16.3, 10.14, 4.0, 33.2));
	}
	public static int max(int num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
	
	public static double max(double num1, double num2) {
		if (num1 > num2)
			return num1;
		else return num2;
		
	}
	
	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}
	
	public static double max(double num1, double num2, double num3, double num4, double num5) {
		return max(max(max(num1, num2), num3, num4),num5);
	}

	
	
}
