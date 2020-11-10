/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author HARRIE
 */

    

import java.text.NumberFormat;

public class Copert 
{
	private double balance;
	String acctName;
        
         Copert() {
        
    }
	
	//Sets up the account
	public Copert (String owner,  double inital)
	{
		acctName = owner;
		balance =  inital;
	}

   
	
	// Deposits money into the account.
	public double deposit (double amount)
	{
		balance = balance + amount;
		
		return balance;
	}
	
	//Withdraws money from the account
	public double withdraw (double amount)
	{
		balance = balance - amount;
		
		return balance;
	}
	
	// returns the balance of an account
	public double getBalance ()
	{
		return balance;
	}
	
	//Returns a one line discription of the account as a string.
	public String toString (String name)
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		return name + "\t" + fmt.format(balance);
	}
}


    

