/*Exercise 3 — Sum of a Range of Sequential Integers
Write a program that asks the user for two integers, low and high and then sums all the integers
(inclusive) low through N. */

import java.util.*;
class low_high{

public static void main(String args[]){

int low,high;
int sum=0;
Scanner sc=new Scanner(System.in);

System.out.println("Enter low number");
low=sc.nextInt();

System.out.println("Enter high number");
high=sc.nextInt();
int i = low;
 while(i<=high)
  {
        sum = sum+i;
         i=i+1;
         
    }
     System.out.println(sum);    
   }
   
   }