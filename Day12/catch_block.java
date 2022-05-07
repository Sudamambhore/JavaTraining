import java.util.*;
public class catch_block{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 2 Number");
        
        try{
             
             a = sc.nextInt();
             b = sc.nextInt();
             c = a / b;
             System.out.println("Division is:--" + c );
             
         }
         catch(Exception e){
              if(e instanceof ArithmeticException){
                   System.out.println("Can not Divisible by Zero");
              }
             else if(e instanceof InputMismatchException){
                  System.out.println("Plz enter int value");
         }    
     }
     
   System.out.println(" Your Program is End "); 
   
   }
 }   