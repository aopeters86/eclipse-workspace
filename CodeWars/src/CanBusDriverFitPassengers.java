
public class CanBusDriverFitPassengers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *   assertEquals("Should return 0.", 0, Bob.enough(10, 5, 5));
		 *   If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.
		 *   cap = 100, on = 60, wait = 50 --> 10 # He can't fit 10 of the 50 waiting
		 */
		
		int capacity = 10;
		int passOn = 5;
		int passWait = 5;
		
		System.out.println(Bob.enough(capacity, passOn, passWait));

	}
	
	public class Bob {
		  public static int enough(int cap, int on, int wait){
		  // your code here
			  int max = on - 1;
		  if(max > wait) {
				return (int)(on - wait) ; 
			  }
		  else
		  return 0;
		}
	}
}

