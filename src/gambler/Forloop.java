package gambler;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		
		int a;
		System.out.println("Enter any number ");
		Scanner scanner = new Scanner(System.in);
		a=scanner.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("Table of your entered num is " +a*i);
		}

	}

}
