/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author HARRIE
 */
import java.util.Scanner;

public class Coper {
   

	public static void main (String[] args)
	{
		int greeting = 0;
		int acctOptions = 0;
		double money = 0;
		
		
		
		System.out.println("Welcome to Eros's bank type 1 to make a new account or 2 to exit: ");
			Scanner scan = new Scanner (System.in);
			greeting = scan.nextInt();
		
		//This is the opening menu switch statement where you create an account
		switch (greeting)
		{
			case 1:
				//Creates a new account for the user.
				System.out.println ("Please enter account name: ");
					Scanner name = new Scanner (System.in);
					
					String owner = name.nextLine();
					
			
			System.out.println ("Welcome: " + owner);
			
			System.out.println (owner +" Please enter your inital deposit amount: ");
				Scanner inital = new Scanner (System.in);
					inital.nextDouble();
				
			Copert acct1 = new Copert();
				
			System.out.println ("After you inital deposit of " + inital + " your current account balance is: " + acct1.getBalance());
			
			break;
			case 2:
				System.out.println("Goodbye.");
				break;
					
		}
        }
}