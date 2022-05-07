//Exercise 2 — Last Chance Gas

import java.util.*;
class Bolts_Nuts
{
 public static void main(String[] args)
 {
      
       
     Scanner ab=new Scanner(System.in);
     System.out.println("Tank capacity:-");
     int a=ab.nextInt();
     System.out.println("Gage reading:-");
     int b=ab.nextInt();
     System.out.println("Miles per gallon:-");
     int c=ab.nextInt();
     int total = a + b + c;
     {
         System.out.println("Total is:-"+total);
     }
     
   if(total<=90)
     {
       System.out.println("Get Gas");
     }
     else{
           System.out.println("You Not Eligital to get Gas");

         }
  }
}  