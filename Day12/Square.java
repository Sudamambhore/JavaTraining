import java.util.*;
 public class Square {
 public static void main(String[] args){
 Scanner sc= new Scanner(System.in);

  System.out.println("Enter the string value: ");
String sr= sc.nextLine();

try{
       int number= Integer.parseInt(sr); 
       System.out.println(number);
       System.out.println("the Sequare is:--"+ number*number);

  }

catch (NumberFormatException ex){
      System.out.println("Entere input is not a valid ");

}
}

}