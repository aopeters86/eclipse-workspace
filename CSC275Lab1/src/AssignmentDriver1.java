import java.util.Scanner;

public class AssignmentDriver1 {
	StudentMethods1 studentMethods1 = new StudentMethods1();
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new AssignmentDriver1();
	}

	public AssignmentDriver1() {
		String[] cargohold = /*{"1", "1", "1", "1", "1", "1", "1", "1", "1", "1"}*/{"", "", "", "", "", "", "", "", "", ""};
		System.out.println("Welcome to the Orion Cargo Hold interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");
		while (true) {
			// Give the user a list of their options
			System.out.println("1: Add an item to the cargo hold.");
			System.out.println("2: Remove an item from the cargo hold.");
			System.out.println("3: Sort the contents of the cargo hold.");
			System.out.println("4: Search for an item.");
			System.out.println("5: Display the items in the cargo hold.");
			System.out.println("0: Exit the Orion Cargo Hold interface.");
			// Get the user input
			int userChoice = input.nextInt();
			input.nextLine();
			switch (userChoice) {
				case 1:
					studentMethods1.addItem(cargohold);
					break;
				case 2:
					studentMethods1.removeItem(cargohold);
					break;
				case 3:
					studentMethods1.sortItems(cargohold);
					break;
				case 4:
					studentMethods1.searchItems(cargohold);
					break;
				case 5:
					studentMethods1.displayItems(cargohold);
					break;
				case 0:
					System.out.println("Thank you for using the Orion Cargo Hold interface. See you again soon!");
					System.exit(0);
			}
		}
	}
}