/*Exercise 2 — Sum of Sequential Integers
Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and
N.  */

import java.util.*;
class sumofall{

public static void main(String args[]){

       int a,b,sum,i;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number");
       a= sc.nextInt();
       i=1;
       sum=0;
       while(i<=a)
       {
           sum=sum+i;
           i=i+1;
       }    
         System.out.println("Addition is:- "+sum);
     }
     
  }     
