package gambler;

import java.util.Scanner;

public class ElseIF {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter marks: ");
		Scanner scanner = new Scanner(System.in);
		a=scanner.nextInt();
		if(a>=80 && a<=99)
		{
			System.out.println("Best");
		}
		else if(a>=60 && a<=80)
		{
			System.out.println("Better");
		}
		else if(a>=40 && a<=60)
		{
			System.out.println("Good");
		}
		else
		{
			System.out.println("Need practice");
		}

	}

}
