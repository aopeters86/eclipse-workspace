
public class ObjectsAndClassesYTExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stored all info, all instantiated in separate class
		
		groceryStore houstonStore = new groceryStore(534, .99, 429, .87);
		groceryStore seattleStore = new groceryStore(765, .86, 842, .91);
		groceryStore orlandoStore = new groceryStore(402, .77, 398, .79);
		
		System.out.println("Houston revenue: $" + houstonStore.grossRev());
		System.out.println("\nOrlando revenue: $" + orlandoStore.grossRev());
		System.out.println("\nSeattle revenue: $" + seattleStore.grossRev());
		
		System.out.println("\nHouston Target: $1000 apple sales \n\nNeed to sell : $" + houstonStore.appleRevenueTarget(1000));
		System.out.println("\nOrlando Target: $1000 of apple sales \n\nNeed to sell: $" + orlandoStore.appleRevenueTarget(1000));
		System.out.println("\nSeattle Target: $1000 apple sales \n\nNeed to sell : $" + seattleStore.appleRevenueTarget(1000));
	
		System.out.println("\nHouston Target: $800 orange sales \n\nNeed to sell: $" + houstonStore.orangeRevenueTarget(800));
		System.out.println("\nHouston Target: $800 orange sales \n\nNeed to sell: $" + orlandoStore.orangeRevenueTarget(800));
		System.out.println("\nHouston Target: $800 orange sales \n\nNeed to sell: $" + seattleStore.orangeRevenueTarget(800));
		
	}

}

class groceryStore{
	
	int applesSold;
	
	double applePrice;
	
	int orangesSold;
	
	double orangePrice;
	
	groceryStore(int as, double ap, int os, double op){
		applesSold = as;
		applePrice = ap;
		orangesSold = os; 
		orangePrice = op;
		
	}
	
	
	double grossRev() {
		
		double revenue = ((applesSold * applePrice) + (orangesSold * orangePrice));
		
		return revenue;
	}
	
	double appleRevenueTarget(double revenue) {
		double appleTar = (revenue / applePrice);
		return appleTar;
	}
	
	double orangeRevenueTarget(double revenue) {
		double orangeTar = ((revenue / orangePrice));
		return orangeTar;
		
	}
	
}

//	void grossRevenue() {
//		
//		double grossRev;
//		grossRev = ((applesSold * applePrice) + (orangesSold * orangePrice));
//		System.out.println("The gross revenue is " + grossRev);
//		
//	}
//		System.out.println("Houston store\nApples Sold: " + houstonStore.applesSold 
//				+ "\n\nApple retail cost: $" + houstonStore.applePrice 
//				+ "\n\nOranges sold: " + houstonStore.orangesSold
//				+ "\nOrange price: $" + houstonStore.orangePrice);
//		
//		System.out.println("\nSeattle gross");
//		seattleStore.grossRevenue();
//		System.out.println("\nOrlando gross");
//		orlandoStore.grossRevenue();
//		System.out.println("\nHouston gross");
//		houstonStore.grossRevenue();
//		double orlandoGross = ((orlandoStore.applesSold * orlandoStore.applePrice)+
//				(orlandoStore.orangesSold * orlandoStore.orangePrice));
//		double seattleGross = ((seattleStore.applesSold * seattleStore.applePrice)+
//				(seattleStore.orangesSold * seattleStore.orangePrice));
//		double houstonGross = ((houstonStore.applePrice * houstonStore.applesSold) + 
//				(houstonStore.orangesSold * houstonStore.orangePrice));
//		double totalGross = (orlandoGross + houstonGross + seattleGross);
//		
//		System.out.println("\nAll stores total Revenue: " + totalGross);
//		System.out.println("\nOrlando's total revenue: " + orlandoGross
//				+ "\n\nSeattle's total: " + seattleGross
//				+ "\n\nHouston's total: " + houstonGross);








//printed
//Houston revenue: $901.89
//
//Orlando revenue: $623.96
//
//Seattle revenue: $1424.12
//
//Houston Target: $1050 apple sales 
//
//Need to sell : $1060.6060606060605
//
//Seattle Target: $620 orange sales 
//
//Need to sell: $681.3186813186813
//
//Orlando Target: $744 of apple sales 
//
//Need to sell: $966.2337662337662

//		houstonStore.applesSold = 534;
//		houstonStore.applePrice = 0.99;
//		houstonStore.orangesSold = 429;
//		houstonStore.orangePrice = 0.87;
//		seattleStore.applesSold = 765;
//		seattleStore.applePrice = 0.86;
//		seattleStore.orangesSold = 842;
//		seattleStore.orangePrice = 0.91;

//		orlandoStore.applesSold = 402;
//		orlandoStore.applePrice = 0.77;
//		orlandoStore.orangesSold = 398;
//		orlandoStore.orangePrice = 0.79;