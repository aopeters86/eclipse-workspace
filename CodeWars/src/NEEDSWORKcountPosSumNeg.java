
public class NEEDSWORKcountPosSumNeg {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,-1,-2,-3,-4,-5} ;
		
		System.out.println(countPositivesSumNegatives(arr).toString());
	}
	
	public static int[] countPositivesSumNegatives(int[] input){
		
		int count = 0;
		int sum = 0;
		int arr[] = {count, sum};
		
		for(int i  = 0; i < input.length; i++) {
		if(i < 0) {
			sum += input[i];
		}
		else {
			count++;			
		}
		
		
//        return null; //return an array with count of positives and sum of negatives
    }
		return arr;

}
}