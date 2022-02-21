package gambler;

import java.util.Scanner;	
	
public class GamblerUc1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the stake amount: ");
		int StakePerDay = scanner.nextInt();
		System.out.println("Enter the bet price per game: ");
		int BetPrice = scanner.nextInt();

		System.out.println("Stake per days is $" + StakePerDay);
		System.out.println("Bet price per game is $" + BetPrice);
		

	}

}
