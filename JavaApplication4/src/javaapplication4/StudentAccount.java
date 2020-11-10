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
    public StudentAccount(String AccountName, int AccountNumber, String AccountType, String Branch, double Balance){
        setAccountName(AccountName);
        getAccountNumber();
        setAccountType(AccountType);
        setBranch(Branch);
        getBalance();
    }
       
public double initBalance(double Withdraw){
    double initBalance = 200;
    if(Withdraw<initBalance){
        System.out.println("insufficient balance");
        
    }
    return initBalance;
    
}
    

    
}
       
        
   
  

 
   
  

   
     
    
    

