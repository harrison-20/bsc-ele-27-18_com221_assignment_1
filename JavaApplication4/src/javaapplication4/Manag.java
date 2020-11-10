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
public class Manag {
    public void Status(){
    Scanner input = new Scanner(System.in);     
       
        do{
            System.out.println("\t\t\tWELCOME! BANK MANAGEMENT SYSTEM \n\t\tSelect Operation Below\n1. List All Accounts And Their Balances\n2. Create A New Account\n3. Deposit Money Into An Account\n4. Withdraw Money From An Account\n5. Check Out Balance\n6. exit\n Enter Your Choice");
        
         //System.out.println("Enter your choice:");
        int Status= input.nextInt();
                
        switch(Status){
           
             case 1: System.out.println(" List All Accounts And Their Balances");
            
             break;
             case 2: System.out.println(" Create A New Account");
           
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
                System.out.println("enter your name: "  );
                String AccountName = input.next();
                if( no == 1){
                System.out.println("enter your reg no: "  );
                String reg = input.next();}
                System.out.println("enter your branch: "  );
                String branc = input.next();
                 String Number =""+ (int)(Math.random() * 10)
                     + (int)(Math.random() * 10) + (int)(Math.random() * 10) + (int)(Math.random() * 10) + (int)(Math.random() * 10)
                ;
         System.out.println("your account number is: " + Number);
                 
                break;
             case 3: System.out.println(" Deposit Money Into An Account");
                break;
             case 4: System.out.println(" Withdraw Money From An Account");
                    
                     
                   
                break;
             case 5: System.out.println(" Check Account Balance");
                  
             break;
              default:
                 System.out.println(" Exit");
                  break;
            }
        }
        while( Stat != 6);
}
