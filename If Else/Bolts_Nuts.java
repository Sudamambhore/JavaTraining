         //Exercise 1 — Order Checker

import java.util.*;
class Bolts_Nuts
{
 public static void main(String[] args)
 {
       int bolts;
       int nuts;
       int washer;
       int total;
       
     Scanner ab=new Scanner(System.in);
     System.out.println("Enter number of Bolts");
     bolts=ab.nextInt();
     System.out.println("Enter number of nuts");
     nuts=ab.nextInt();
     System.out.println("Enter number of washer");
     washer=ab.nextInt();
     total = bolts + nuts + washer;
     {
         System.out.println("Total is:-"+total);
     }
     
     if(bolts==nuts || 2*washer==bolts)
     {
       System.out.println("Order is OK.");
     }else{
           System.out.println("Check the Order: too few nuts" );

           }
           
       bolts=bolts*5;
       nuts=nuts*3;
       washer=washer*1;
      
         
          
     
  }   
}     
     


     
       