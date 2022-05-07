/*Create classes that capture bank customers and bank accounts. A customer has a first and last
name. An account has a customer and a balance. Make objects for two accounts held by the
same customer.*/

import java.util.*;
class Bank_details
{
public static void main(String args[])
 {
   int acnum,acbal,pin;
   Scanner sc= new Scanner(System.in);
   acnum =  sc.nextInt();
   System.out.println("Enetr Your account Number");
   acbal =  sc.nextInt();
   System.out.println("Enetr account balance");
   pin =  sc.nextInt();
   System.out.println("Enetr Your Pin Number");
   
void deposite(int dep)
        {
           System.out.println("Enter Account to deposite");
           int ammount = sc.nextInt();
           int dep = acbal + ammount ;
           System.out.println("Deposite Successful.. New Balance is "+dep);
         }
         
void withdrawal(int p1) 
     {
          System.out.println("Enter PIN");
          int p1= sc.nextInt();
        if(p1==pin)
        {
           System.out.println("Enter Amount to withdraw:-");
           int amt  =  sc.nextInt(); 
            
             if(acbal > amt)
              {
                int p2 = acbal - amt;
                System.out.println("Withdrawal Successful.. New Balance is"+p2);
                
              }
              else
              {
                 System.out.println("Insufficient Funds..");
              }
          else
             {
                System.out.println("PIN did not match..");
             }       
          }
       }
         
void  check_balance() 
    {
      System.out.println("Current Balance is:-");    
      int Current = sc.nextInt();
      
          if(Current == pin)
          {
            System.out.println("Current Balance is :"+acbal);
          }
          
          else
          {
             System.out.println("PIN did not match..");
          }  
               
      }
      
void pin_change()
  {
  
       System.out.println("Enter current PIN");
       int change = sc.nextInt();
       if(change==pin)
       {
           System.out.println("Enter New Pin");
           int cuu = sc.nextInt();
           System.out.println("Re-Enter New Pin");
           int cuu1 = sc.nextInt();
           
           if(cuu == cuu1)
           {
             change = cuu;
             System.out.println("PIN changed Successfully..");
           }
           else
            {
               System.out.println("Confirmation PIn did not match...");
            }
            
       else
          {
            System.out.println("PIN did not match..");
          }   
      
      } 
   }    
     
void check_minimum_balance()
{
  if(acbal < 5000)
    {
       System.out.println("Account Balance is Below minimum required Balance..");
       System.out.println("Rs. 20 is deducted from you account");  
       int min = acbal - 20;
       System.out.println("New Balance is"+min);  
    }
    
   else
     {
        System.out.println("Account Balance is Maintained");
     }  
}
     
while (true);
 {
    System.out.println("Select an operation");
    System.out.println("1 - Deposite");
    System.out.println("2 - Withdrawal");
    System.out.println("3 - Check Balance");
    System.out.println("4 - PIN change");
    System.out.println("5 - Checka minimum balance");
    System.out.println("Provide your choice ");
    
 }
     
    int ch = sc.nextInt(); 

class Demo{
   public static void main(System.in){
      
       if (ch==1)

     {
        Bank_details t1=new Bank_details();
        t1.deposite();
     }   
    else if (ch==2)
     {
        t1.withdrawal();
        Bank_details t2=new Bank_details();
     } 
     
    else if (ch==3)

    {
        t1.check_balance();
        Bank_details t3=new Bank_details();
    } 
      
    else if (ch==4)
    {
        t1.pin_change();
        Bank_details t4=new Bank_details();
    }
    
    else if (ch==5)
    {
       t1.check_minimum_balance(); 
       Bank_details t5=new Bank_details();
    } 
    else{
      System.out.println("Enter valid Number");
    }     
  
 }

}       
     
     
               
                
                

   
   