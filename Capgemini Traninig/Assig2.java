import java.util.Scanner;
class Assig1{
public static void main(String args[])

{
   float a;
   float b;
   float c;   
   
   System.out.println("Enter Two number");
   Scanner su=new Scanner(System.in);
   a = su.nextFloat();
   b = su.nextFloat();
   
   c = b;
   b = a;
   a = c;
   
   System.out.println("Swapping Elements are : a is"+a +"b is"+b);

   
  }
}  