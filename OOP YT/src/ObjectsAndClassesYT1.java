
public class ObjectsAndClassesYT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		classes define the TEMPLATE / FORM Of the things involved
//		Objects are specific instances of the TEMPLATE
//		Instance is when an object is created
//		member or class member = variables or methods that are part of the class
//		Instance variable - variables that are part of the class definition
//		Define Class = className{
//		inside ^^ declare instance variables
//		declare methods
//		}
		
		//Aircraft Class
		//the type	the name
		//creates object of class aircraft
		aircraft.wings = 2;
		aircraft cessna172 =  new aircraft(4, 140, 56.5, 9.5);
		
		aircraft piperSaratoga = new aircraft(6,201,102.5,20.5);
		
		//create double variable to hold endurance hours
		double cessna172Endurance;
		double piperSaratogaEndurance;
		
//		cessna172.passengers = 4;
//		cessna172.cruiseSpeed = 140;
//		cessna172.fuelCapacity = 56.5;
//		cessna172.fuelBurnRate = 9.5;
		cessna172Endurance = cessna172.fuelCapacity / cessna172.fuelBurnRate;
//		System.out.println("Cessna 172 passengers: " + cessna172.passengers);
		System.out.println("Cessna 172 fuel burn rate: " + cessna172.fuelBurnRate + " gph");		
		System.out.println("A Cessna 172 can stay aloft for " + cessna172Endurance + " hours. \n");
		
//		piperSaratoga.passengers = 6;
//		piperSaratoga.cruiseSpeed = 201;
//		piperSaratoga.fuelCapacity = 102.5;
//		piperSaratoga.fuelBurnRate = 20.5;
		piperSaratogaEndurance = piperSaratoga.fuelCapacity / piperSaratoga.fuelBurnRate;
		
			
		System.out.println("Piper Saratoga cruise speed: " + piperSaratoga.cruiseSpeed + " mph");
//		System.out.println("Piper Saratoga passengers: " +  piperSaratoga.passengers	);	
		System.out.println("Piper Saratoga fuel burn rate: " + piperSaratoga.fuelBurnRate + " gph");
		System.out.println("A Piper Saratoga can stay aloft for " + piperSaratogaEndurance +" hours.");
	
		System.out.println("\nCessna 172");
		cessna172.calculateEndurance();
		
		System.out.println("\nPiper Saratoga");
		piperSaratoga.calculateEndurance();
		
		
		
		//sttic, call class then variable, acts as a global variable
//		System.out.println("All of my aircraft have " + aircraft.wings + " wings");
//		System.out.println(cessna172.wings);
//		System.out.println(piperSaratoga.wings);
		
//		cessna172.passengers = 189;
//		cessna172.setPassengers(5);
	}

}


//defining general form 
class aircraft{
	
	//constructor, no return type. ntb inside class. this holds the paramaters that are passed through 
	//
	aircraft(int p, int c, double fc, double fbr){
		passengers = p;
		cruiseSpeed = c;
		fuelCapacity = fc;
		fuelBurnRate = fbr;
	}
	
	//input characteristics of aircraft
	
	private int passengers;			//num of people
	int cruiseSpeed;		//mph	
	double fuelCapacity;	//gal
	double fuelBurnRate;	//gph
	static int wings;
	
	//method to calculate aircraftt endurance
	
	void calculateEndurance() {
		double endurance;
		endurance = fuelCapacity / fuelBurnRate;
		System.out.println("The endurance is " + endurance + " hours.");
		
		
		
	}
	
	void setPassengers(int p) {
	if((p>0 ) && (p<10)) {
		passengers = p;
		System.out.println("Revised passengers = " + passengers);
	}
	else 
		System.out.println("Error setting passengers");
	
}


}
