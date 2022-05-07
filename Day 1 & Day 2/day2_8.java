import java.util.Scanner;
class day2_8
{ 
public static void main(String args[])
{


    int Physics, Chemistry, Biology, Mathematics,Computer,sum,Total;
    
      Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a ");
		Physics = sc.nextInt();
		Chemistry = sc.nextInt();
		Biology = sc.nextInt();
      Mathematics = sc.nextInt();
      Computer = sc.nextInt();
		sum = (Physics + Chemistry + Biology + Mathematics + Computer); 
      Total = sum/5;
     
      System.out.println("average is :-" + Total);
      
     if (Total > 90)
     {
        System.out.println("Grade A" );
        
     }  
     
     else if (Total > 80)
     {
        System.out.println("Grade B" );
        
     } 
     
     else if (Total > 70)
     {
        System.out.println("Grade C" );
        
     }  
     
     else if(Total > 60)
     {
        System.out.println("Grade D" );
        
     } 
     
     else if(Total > 50)
     {
        System.out.println("Grade E" );
        
     }  
     else if (Total > 40)
     {
        System.out.println("Grade F" );
        
     }    
   
      
 }
 }   
