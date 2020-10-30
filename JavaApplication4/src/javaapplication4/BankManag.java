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
public class BankManag {
    


    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("                WELCOME! BANK MANAGEMENT SYSTEM \n           Select Operation Below\n1. List All Accounts And Their Balances\n2. Create A New Account\n3. Deposit Money Into An Account\n4. Withdraw Money From An Account\n5. Check Out Balance\n6. exit\n Enter Your Choice");
         //System.out.println("Enter your choice:");
        int Status = input.nextInt();
                
       
       
        
        switch(Status){
           
             case 1: System.out.println(" list all acounts and their balances");
             System.out.println(" enter your password to proceed: ");
                String password = input.nextLine();
             break;
             case 2: System.out.println(" create a new account");
           
              
                break;
             case 3: System.out.println(" deposit money into an account");
                break;
             case 4: System.out.println(" withdraw money from an account");
                break;
             case 5: System.out.println(" check account balance");
                break;
              
               
              default:
                 System.out.println(" exit");
                  break;
                    
             
               
        }
        // TODO code application logic here
    }
}

    
}
