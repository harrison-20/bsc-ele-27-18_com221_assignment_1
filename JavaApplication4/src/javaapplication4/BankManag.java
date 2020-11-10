/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author HARRIE
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class BankManag{
     private String AccountName;
     private int AccountNumber;
     private String Branch;
     private String AccountType;
     java.util.Date DateCreated;
     private double Balance;
     
     public BankManag(){
          Scanner input = new Scanner(System.in);
          ArrayList<String> Account = new ArrayList();
    int Status = 6;
    
        do{
            System.out.println("\t\t\tWELCOME! BANK MANAGEMENT SYSTEM \n\t\tSelect Operation Below\n1. List All Accounts And Their Balances\n2. Create A New Account\n3. Deposit Money Into An Account\n4. Withdraw Money From An Account\n5. Check Out Balance\n6. exit\n Enter Your Choice");
      
           
       Status= input.nextInt();
                 
        switch(Status){
           
             case 1: System.out.println(" List All Accounts And Their Balances" );
         
            System.out.println( Account); 
           System.out.println("Account Number\t\tAccount Name\t\t Account Type\t\tBranch\t\t\tBalance");
           System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
           System.out.println(+AccountNumber+"\t\t\t"+AccountName+"\t\t    "+AccountType+"\t\t\t"+Branch+"\t\t\tk"+Balance);
             
                 System.out.print("enter any key to proceed: ");
             String key = input.next();
             break;
             case 2: System.out.println(" Create A New Account");
                Account.add("account");
      
            
                 System.out.println( " \n1. student account\n2. executive account\n\t\tEnter your choice");
                int no = input.nextInt();
                switch(no){
                    case 1:
                         System.out.println("Creating a new student bank Account");
                        break;
                    case 2:
                         System.out.println("Creating a new executive bank Account");
                        
                        break;
                    default:
                         System.out.println("exit");
                      break;          
                        }
                //if your are a student then enter your reg number
                if( no == 1){
                System.out.print("enter reg n#: "  );
                String reg = input.next();}
                 System.out.print("enter name: "  );
                AccountName = input.next();
                //generating a random account number
                AccountNumber = (int)(Math.random() *10 * 10*10*10*10);
                System.out.println("your account number: " + AccountNumber );
                //enter the bank account type savings or current
                System.out.print("enter account type: "  );
                AccountType = input.next();
                //enter the branch
                System.out.print("enter branch: "  );
                Branch = input.next();
                //balance
                System.out.print("enter your balance: k"  );
                Balance = input.nextDouble();
                //displayimg this if all variables entered
                System.out.println("\tAccount successfully created"  );
                //to proceed enter any key
                System.out.print("enter any key to continue: "  );
                String ke = input.next();
                 
                break;
             case 3: System.out.println(" Deposit Money Into An Account");
              System.out.println("enter your account number to procced: ");
                double numb = input.nextDouble();
                if(numb == AccountNumber){
                    System.out.print("enter your amount: ");
             double Amount = input.nextDouble();
              System.out.println("amount deposited successfully!");      
                  Balance += Amount ;
                System.out.println("your new balance is  " +Balance);  
                }else{
                      System.out.println("account number did not match ");
                } 
                 System.out.print("enter any key to exit: ");
                    String hu = input.next();
                break;
             case 4: System.out.println(" Withdraw Money From An Account");
             System.out.println("enter your account number to procced: ");
                double nu = input.nextDouble();
                if(nu == AccountNumber){
               System.out.print("enter your amount: ");
                 double Amount = input.nextDouble();
                 boolean exit = false;
                 do{
                     
                    if(Balance < Amount) {
                   System.out.println("amount withdrawn exceeds the current balance!");
                   System.out.println("operation not successful");
                    }
                 }while(exit);
                        if(Balance>Amount){
                    System.out.println("amount withdrawn successfully!");      
                  Balance -= Amount;
                  System.out.println("your balance remaining is  " +Balance);
                    }
                }else
                     { System.out.println("account number did not match "); 
                }
                    System.out.print("enter any key to proceed: ");
                    String k = input.next();
                break;
             case 5: System.out.println(" Check Account Balance");
               System.out.println("enter your account number to procced: ");
                double num = input.nextDouble();
               if(num == AccountNumber){
               System.out.println("your balance is : " +Balance);
               
               }else{
                   System.out.println("account number did not match ");
                    
               }
               System.out.print("enter any key to exit: ");
                    String h = input.next();
                        
             break;
              default:
                 System.out.println(" Exit");
                  break;
            }
        
        
        } while( Status !=6);    
       
    }

     
    
     public BankManag(String AccountName,int AccountNumber, String Branch, double Amount){
         DateCreated = new java.util.Date();
         this.AccountName = AccountName;
         this.AccountNumber = AccountNumber;
         this.Branch = Branch;
         this.AccountType=AccountType;
         this.Balance = 0.00;
         
     } 
     Scanner input = new Scanner(System.in);
    
       //set a new account name
    public void setAccountName(String AccountName){
        this.AccountName = AccountName;
    }
     //return the name
       public String getAccountName(){
           return AccountName;
    }
    //return an account number
       public int getAccountNumber(){
        return AccountNumber;
       }
       //set an account type
       public void setAccountType(String AccountType){
           this.AccountType=AccountType;
       }
        //return an account type
       public String getAccountType(){
           return AccountType;
       }
       //set a new branch
       public void setBranch(String Branch){
        this.Branch = Branch;
    }
          //return branch
       public String getBranch(){
          return Branch;
               }
       //set a new balance
        public void setBalance(double Balance){
        
             
        this.Balance = Balance;
    }
       //return balance
    public double getBalance(){
              return Balance;
    }
  //return date
     public java.util.Date getDateCreated(){
        DateCreated = new java.util.Date();
         
        return DateCreated;
    }
     
}