package gambler;

import java.util.Scanner;

public class Dowhile_loop {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter number: ");
		Scanner scanner = new Scanner(System.in);
		num=scanner.nextInt();
		do
		{
			System.out.println(num);
			++num;
			
		}
		while(num<=10);

	}

}
