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
public class IntoBank {
    public static void main(String[] args){  
     Scanner input = new Scanner(System.in);     
     
        //create a student account object 
       StudentAccount Studen = new StudentAccount();
          Studen.getBalance();
          Studen.getAccountName(); 
        Studen.getAccountNumber();
        Studen.getBranch();
        Studen.getAccountType();
        
       //create an executive account object
        Executive ExecutiveAccount = new Executive();
        ExecutiveAccount.getAccountName(); 
        ExecutiveAccount.getAccountNumber();
        ExecutiveAccount.getBranch();
        ExecutiveAccount.getAccountType();
        ExecutiveAccount.getBalance();
           
           
             
    }
}
