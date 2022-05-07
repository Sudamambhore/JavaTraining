/*Exercise 7 —Your Age in Seconds
Write a program that asks for your age in years, months, and days and writes out your age in
seconds. Do this by calculating the number of total days you have been alive, then multiply this
by the number of hours per day (24), the number of minutes per hour (60), and the number of
seconds per minute (60). Assume that there are 365 days per year (ignore leap years). But
correctly take account of the different number of days in different months. If the user enters 5 for
the number of months, add up the number of days in the first 5 months: 31 + 28 + 31 + 30 +
31
A human lifespan is about 2.5 billion seconds (2.5 billion heart-beats). Write out what
percentage of your expected lifespan you have lived. */


import java.util.*;
class age{
         public static void main(String[] args){
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Your year");
         int year = sc.nextInt ();
         
       int result=year*365*24*60*60;
         
         System.out.println(" Your year converted in to secnds:--"+result);
         }
         }