
public class SumOfPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int test[] = {14,-10, 10};
		
		System.out.println("Sum: " + sum(test));
		
	}
	public static int sum(int[] arrayIn) {
			
		
		int positive = 0;
		
		if(arrayIn.length == 0) {
			return 0;
		}
		
		for (int i = 0; i < arrayIn.length; i++) {
			if(arrayIn[i] > 0) {
				positive += arrayIn[i];
				
			}
	
}
		return positive;
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	
//	
//	
//	public static int sum(int[] arr) {
//		int positive = 0;
//		
//		if(arr.length==0){
//			return 0;
//		}
//		
//		for(int i =0; i<arr.length; i++) {
//			if (arr[i] > 0) {
//				positive += arr[i];
//				
//			}
//			
//		}    
//		
//		return positive;
//		
//	}
//}