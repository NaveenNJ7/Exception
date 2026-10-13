package Checkedexception;

import java.util.Scanner;

public class InsufficientBalanceException extends Exception {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount to be withdrawn");
		int w = sc.nextInt();
		
		if(w<=100)
		{
			System.out.println("Amount withdrawn successfully");
		}
		else
		{
			try
			{
				throw new InsufficientBalanceException();
			}
			catch(InsufficientBalanceException i)
			{
				System.out.println("Insufficient Balance");
			}
		}
		
	}

}
