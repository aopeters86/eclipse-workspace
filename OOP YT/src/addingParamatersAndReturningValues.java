
public class addingParamatersAndReturningValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare some variables
		
		int num1 = 11;
		int num2 = 7;
		boolean answer3;
		//declare answers to pass the emthod to
		//pass value of num1 into multNumbers
		int answer1;
		int answer2;
		answer1 = multNumbers(num1);
		answer2 = addNumbers(num1, num2);
		answer3 = equalNumbers(num1, num2);
		System.out.println("When we multiply num1 by 7 we get " + answer1);
		System.out.println("When we add num1 and num2, we get:  " + answer2);
		System.out.println("num1 and num2 are equal: " + answer3);
	}
	
	//method multipies num1 by 8
	//use keyword int instead of void to pass back
	public static int multNumbers(int a) {
		//store answer in local variable and return ans;
		int ans = a*7;
		return ans;
	}
	
	public static int addNumbers(int x, int y) {
		int ans = x + y;
		return ans;
	}
	//return a true / false
	public static boolean equalNumbers(int r, int t) {
		if (r == t) return true;
		else return false;
		
	}
	

}
