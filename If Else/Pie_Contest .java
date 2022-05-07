/*Exercise 4 — Pie Eating Contest
At the State Fair Pie Eating Contest all contestants in the heavyweight division must weigh
within 100 pounds and 250 pounds. Write a program that asks for a contestant's weight and then
says if the contestant is allowed in the contest. */

import java.util.*;
class Bolts_Nuts
{
 public static void main(String[] args)
 {
     Scanner ab=new Scanner(System.in);
     System.out.println("Enter your weight");
     int a=ab.nextInt();
     
     if(a>=100 && a<=250){
        System.out.println("contestants eligible FOR Contest");
        }
        
     else{
     
      System.out.println("contestants are not Eligible For Contest");
      }
      
     }
   }  

