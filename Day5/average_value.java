      //Write a Java program to calculate the average value of array elements. 

import java.util.*;

class average_value
{
  public static void main(String[] args) 
  
  {   
 
        int[] numbers = new int[]{20, 30, 25, 35, 65}; //int[] numbers = new int[]{20, 30, 25, 35, 65};
        int sum = 0;
       for(int i=0; i < numbers.length ; i++)
        sum = sum + numbers[i];
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average); 
   
   }
} 