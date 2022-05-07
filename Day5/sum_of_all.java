   //Write a program   to find the sum of all elements of the array.
   
import java.util.*;   
class Sum_of_all
 {  
    public static void main(String[] args) 
    {  
  
        int [] arr = new int [] {11, 12, 13, 24, 15};  
        int sum = 0;  
          
        for (int i = 0; i < arr.length; i++) 
         {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements is: " + sum);  
    }  
}    
   
   