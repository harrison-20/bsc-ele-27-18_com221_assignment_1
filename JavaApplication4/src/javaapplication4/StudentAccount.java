/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author HARRIE
 */
public class StudentAccount extends BankManag {
    public StudentAccount(){
    }
    public StudentAccount(String AccountName, double AccountNumber, String Branch){
        setAccountName(AccountName);
        setAccountNumber(AccountNumber);
        setBranch(Branch);
    }
    public double getBookOpeningBalance(){
        double BookOpeningBalance = 200;
        return BookOpeningBalance;
 
    }

   
     
    
    
}
