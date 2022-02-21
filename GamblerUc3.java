package gambler;

import java.util.Scanner;

public class GamblerUc3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the stake amount: ");
		int StakePerDay = scanner.nextInt();
		System.out.println("Enter the bet price per game: ");
		int BetPrice = scanner.nextInt();
		
		int maxStake = StakePerDay + 50 % StakePerDay;
		int minStake = StakePerDay - 50 % StakePerDay;

		System.out.println("Stake per days is $" + StakePerDay);
		System.out.println("Bet price per game is $" + BetPrice);
		
		//UC1 Gamble $1 bet so eaither win or loose
		while (StakePerDay > minStake && StakePerDay < maxStake) {
			int play = (int) (Math.random() * 2);
			switch (play) 
			{
			case 0:
				StakePerDay += BetPrice;
				System.out.println("The player has won $1");
				System.out.println("The stake after winning is $" + StakePerDay);
				break;

			case 1:
				StakePerDay -= BetPrice;
				System.out.println("The player has lost $1");
				System.out.println("The stake after lossing is $" + StakePerDay);
				break;
			}
		}
		

	}

}