package gambler;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		int num1,num2,num3;
		System.out.println("Enter three numbers  ");
		Scanner scanner = new Scanner(System.in);
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
				
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Greater Number is " + num1);
			}
			else
			{
				System.out.println("Greater Number is " +num3);
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("Greater Number is " +num2);
			}
			else
			{
				System.out.println("Greater Number is " +num3);
			}
		}

	}

}
