/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author HARRIE
 */
public class Executive extends BankManag {
    private double initBalance;
    
    public Executive(){
    
}
 
    

    public Executive(double initBalance){
        this.initBalance = initBalance;
        
    }
    public Executive(double initBalance, String AccountName, int AccountNumber, String Branch, String AccountType, double Balance){
        this.initBalance = 20000; 
        setAccountName(AccountName);
        getAccountNumber();
        setBranch(Branch);
         setAccountType(AccountType);
         getBalance();
    }    
    public double getinitBalance(double Withdraw){
     initBalance = 20000;
    if(Withdraw<initBalance){
        Withdraw -= initBalance;
        System.out.println("you have a dept of "+getBalance());
        
        System.out.println("your new balance is " +getBalance());    
        
    }
    return this.initBalance;
    
}
}