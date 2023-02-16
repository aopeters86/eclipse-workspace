import java.util.Scanner;
public class Cost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//Make pgm to compare cost
		
		
		//prompt user to enter weight and cost pkg 1
		System.out.println("This app compares prices.\n"
				+ "Enter price and weight for package 1: ");
		double price1 = input.nextDouble(); 
		double weight1 = input.nextDouble();
		
		
		//prompt user to enter weight and cost pkg 2
		System.out.println("Enter price and weight for package 2: ");
		double price2 = input.nextDouble(); 
		double weight2 = input.nextDouble();
		
		//final double PRICE_PER_POUND;
		
		//calculate the price for packages
		
		double priceWeight1 = price1 / weight1;
		double priceWeight2 = price2 / weight2;
		
		//price outputs
		if (priceWeight1 == priceWeight2) {
			System.out.print("This package is the same price.");
		}
		
		else if (priceWeight1 > priceWeight2) {
			System.out.print("Package 2 has a better price.");
		}
		
		else if (priceWeight1 < priceWeight2) {
			System.out.print("Package 1 has a better price");
		}
			
	}

}
