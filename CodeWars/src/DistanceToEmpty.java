
public class DistanceToEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double distance = 50;
		double mpg = 25;
		double gallons = 2;
		
		System.out.println("Is this a doomed trip? " + willWeMakeIt(distance, mpg, gallons));
//		willWeMakeIt(distance, mpg, gallons);

	}
	
	public static boolean willWeMakeIt(double dist, double mpg, double gal) {
		
		double makeIt = ((gal * mpg) - dist);
		
		boolean willMake = false;
		
		if(makeIt <= 0) {
			return true;
		
		
		
	}
		return willMake;
	
}
}
