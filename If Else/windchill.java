/*
Exercise 6   Wind Chill Index
Write a program that calculates the wind chill index given the temperature and the wind speed.
C:\JavaCode> java WindChill
Enter Wind Speed:
15
Enter Temperature:
20
Wind Chill: 6.218885266083872
The wind chill index (WCI) is calculated from the wind speed v in miles per hour and the
temperature temp in Fahrenheit. Three formulas are used, depending on the wind speed:
If wind speed is less than 3 mph then wind chill = current temperature
If the current temperature is greater than 50  F then wind chill = current
temperature
otherwise, wind chill = 35.74 + 0.6215*temp - 35.75*v0.16 + 0.4275*temp*v0.16
You will need to import java.lang.Math and use floating point input for this exercise. To
calculate v0.16 use Math.pow().
*/
   import java.lang.Math;
   import java.util.*;
   class windchill

{
   public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 
 System.out.println("Enter wind speed:");
 
 float ws=sc.nextFloat();
 
 System.out.println("Enter Tempreature:");
 
 float tem=sc.nextFloat();
 
 double wind_chill=0;
 
 if (ws<3 && tem>50)
 {
 System.out.println("wind chill = current temperature");
 }
 else
 {
 wind_chill = 35.74 + (0.6215*tem) +( (0.4275*tem - 35.75) * Math.pow(ws, 0.16));
 
 System.out.println(wind_chill);
 }
 }
 
}