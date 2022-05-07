import java.util.Scanner;

//equals,equalsIgnoreCase,trim
public class equalsIgnoreCase1 {
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter username");
      String un=sc.nextLine();
      System.out.println("Enter password");
      String pass=sc.nextLine();
      un=un.trim();
      pass=pass.trim();
  
    if(un.equalsIgnoreCase("abc")&& pass.equalsIgnoreCase("xyz")){
        System.out.println("Valid");
    }else{
      System.out.println("InValid");
    }

    }
}

