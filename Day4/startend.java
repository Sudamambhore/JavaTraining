  /*Exercise 1 — Run of Integers
Write a program that asks the user for a starting value and an ending value and then writes all the
integers (inclusive) between those two values.*/


import java.util.*;
class startend{

public static void main(String args[]){

       int st,end,i;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Start Number");
       st= sc.nextInt();
       System.out.println("Enter End Number");
       end = sc.nextInt();
       i = st;
       
       while(i <= end)
       {
            System.out.println(i);
            i=i+1;
          }
                    
    }
    
  }     