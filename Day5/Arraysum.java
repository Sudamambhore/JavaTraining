          //Write a program   to store elements in an array and print it.


import java.util.Scanner;  
class Arraysum   
   {  
     public static void main(String[] args)   
   {  
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements: ");  
        n=sc.nextInt();  
        int[] array = new int[10];  
        System.out.println("Enter the elements of the array: ");  
   for(int i=0; i<n; i++)  
    {     
        array[i]=sc.nextInt();  
    }  
        System.out.println(" Your Arrays are: ");    
   for (int i=0; i<n; i++)   
    {  
      System.out.println(array[i]);  
    
    }  
  
  }  

}    