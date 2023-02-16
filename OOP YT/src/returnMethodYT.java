
public class returnMethodYT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		aircraft1 cessna172 =  new aircraft1();
		aircraft1 piperSaratoga = new aircraft1();
		
		
		cessna172.passengers = 4;
		cessna172.cruiseSpeed = 140;
		cessna172.fuelCapacity = 56.5;
		cessna172.fuelBurnRate = 9.5;
		
		piperSaratoga.passengers = 6;
		piperSaratoga.cruiseSpeed = 201;
		piperSaratoga.fuelCapacity = 102.5;
		piperSaratoga.fuelBurnRate = 20.5;
		
		System.out.println("\nCessna 172 endurance is: " 
		+ cessna172.calculateEndurance());
		
		System.out.println("\nPiper Saratoga endurance is: " 
		+ piperSaratoga.calculateEndurance());
		
		System.out.println("\nFor Cessna 172 to fly for 2.5 hours, it takes " 
				+ cessna172.fuelNeeded(2.5) + " gallons of fuel");
		
		System.out.println("\nFor Piper Saratoga to fly for 2.5 hours, it takes " 
		+ piperSaratoga.fuelNeeded(2.5) + " gallons of fuel");

	}

}
class aircraft1{
	
	//input characteristics of aircraft
	
	int passengers;			//num of people
	int cruiseSpeed;		//mph	
	double fuelCapacity;	//gal
	double fuelBurnRate;	//gph
	
	//method to calculate aircraftt endurance
	
	double calculateEndurance() {
		//double endurance;
		double endurance = fuelCapacity / fuelBurnRate;
		//System.out.println("The endurance is " + endurance + " hours.");
		return endurance;
		
		
		
		
	}
	
	double fuelNeeded(double time) {
		
		return fuelBurnRate * time;
	}
	
}
