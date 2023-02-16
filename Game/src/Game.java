import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter rock paper or scissor
		System.out.print("This is Rock Paper Scissors, try your luck vs. the computer!\n"
				+ "Enter a number Rock(0), Paper(1), Scissor(2): ");
		int userIn  = input.nextInt();
		
		
		if (userIn == 0);//{
			//System.out.println("You are Rock");
		//}
		else if (userIn == 1); //{		
			//System.out.println("You are Paper");
		//}
		
		else if  (userIn == 2); /*{
			System.out.println("You are Scissors");
		}
		*/
		//int userIn1 = (int)(Math.random());

		
		//generate random number for computer
		int comp1 = (int) (Math.random() * 3);
		
		/*
		if (comp1 == 0) {
		 	System.out.println("Computer is Rock");
		}
		else  if (comp1 == 1) {
			System.out.println("Computer is Paper");
		}
		else  if (comp1 == 2) {
			System.out.println("Computer is Scissors");
		}
		*/
		
		if (userIn == 0 && comp1 == 0) {
			System.out.println("You are rock, computer is rock too. Draw!");
		}
		else if (userIn == 1 && comp1 == 1) {
			System.out.println("You are paper, computer is paper too. Draw!");
		}
		else if (userIn == 2 && comp1 == 2) {
			System.out.println("You are scissor, computer is scissor too. Draw!");
		}
		else if (userIn == 0 && comp1 == 1) {
			System.out.println("You are rock, computer is paper.\n"
					+ "Paper beats rock! You Lose!");
		}
		
		else if (userIn == 0 && comp1 == 2) {
			System.out.println("You are rock, computer is scissor.\n"
					+ "Rock beats scissor, You win!");
		}
		
		else if (userIn == 2 && comp1 == 1) {
			System.out.println("You are Scissor, computer is paper.\n"
					+ "Scissor beats paper, you win!");
		}
		
		else if (userIn == 1 && comp1 == 2) {
			System.out.println("You are paper, computer is scissor.\n"
					+ "Scissor beats paper, you lose!");
		}
		
		else if (userIn == 2 && comp1 == 0) {
			System.out.println("You are Scissor, computer is rock.\n"
					+ "Rock beats scissor, you lose!");
		}
			
		else if (userIn == 1 && comp1 == 0) {
			System.out.println("You are paper, computer is rock.\n"
					+ "Paper beats rock, you win!");
		}
		/*if (userIn == 0 && comp1 == 0) {
			System.out.println("You are " + userIn + ", computer is " + comp1 + ", Draw! ");
		}
		
		else if (userIn > comp1) {
			System.out.println("You are " + userIn + ", computer is " + comp1 + ", You win! ");
		}
		else if (userIn < comp1) {
			System.out.println("You are " + userIn + ", computer is " + comp1 + ",You Lose, Loser!!");
		}*/
		
		
		
		

		/*else if (comp1 < 1) {
		System.out.println("Computer is rock, paper beats rock. You win");			
	}*/
	
	}
}