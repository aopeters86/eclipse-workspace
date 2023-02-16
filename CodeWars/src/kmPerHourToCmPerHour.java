
public class kmPerHourToCmPerHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*The cockroach is one of the fastest insects. 
		 * Write a function which takes its speed in km per hour and
		 *  returns it in cm per second, rounded down to the integer (= floored).

For example:

1.08 --> 30
Note! The input is a Real number (actual type is language dependent) and is >= 0. The result should be an Integer.
		 * 
		 */
		
		double a = 1.08;
		System.out.println(cockroachSpeed(a));
	}
	
	public static int cockroachSpeed(double x){
		
		//double x = km/hr
		//km /hr to cm/sec = 
		int speedCmPerHour = 0;
		speedCmPerHour = (int)(x*27.778);
		 
			 return speedCmPerHour;
	
			    // Good Luck!
	}
}
