package gambler;

import java.util.Scanner;

public class GamblerUc5 {
	int stakePerDay;
	int betPrice = 1;
	int minStake = 50;
	int maxStake = 150;
	int win = 0;
	int loose = 0;
	int profit = 0;

	public void play() {
		while (stakePerDay > minStake && stakePerDay < maxStake) // Win or Lost 50% 
		{
			int play = (int) (Math.random() * 2); //
			switch (play) {
			case 0: // Winning case
				stakePerDay += betPrice;
				// System.out.println("The player wins $1");
				break;

			case 1: // Loosing case
				stakePerDay -= betPrice;
				// System.out.println("The player looses $1");
				break;
			}
		}
	}

	public void gamble20Days() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the Stake amount:");
		int num = scanner.nextInt();
		for (int days = 1; days <= 30; days++) { // 30 days looping
			stakePerDay = num; // getting input for Stake Per day
			play();
			System.out.println("The player has stake of " + stakePerDay + " on day " + days);
			int balanceDay = stakePerDay - 100; // profit = stakePrice -100
												
			profit += balanceDay;
			if (stakePerDay > minStake) {
				win++; 
			} else {
				loose++;
			}
			System.out.println("Profit or loss of the day is " + balanceDay);
		}
		System.out.println("In 20 days, the player has won " + win + " days and loose " + loose + " days");
		System.out.println("The total amount for 20 Days is $" + profit); // total profit
		scanner.close();
	}

	public static void main(String[] args) {
		GamblerUc5 gamble = new GamblerUc5();
		gamble.gamble20Days();
	}
}