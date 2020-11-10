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
    public StudentAccount(String AccountName, int AccountNumber, String AccountType, String Branch, String Account, double Balance){
        setAccountName(AccountName);
        getAccountNumber();
        setAccountType(AccountType);
        setBranch(Branch);
        getBalance();
        Account();
    }
       
public double initBalance(double Amount){
    double initBalance = 200;
    if(Amount<initBalance){
        System.out.println("insufficient balance");
        if(Amount<initBalance){
        Amount -= initBalance;
        System.out.println("you can not withdraw more than  "+getBalance());
         
                System.out.println("your new balance is  " +getBalance()); 
        System.out.println("your new balance is " +getBalance());    
        
        
        }
    }
    return initBalance;
    
}
    

    
}
       
        
   
  

 
   
  

   
     
    
    

