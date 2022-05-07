import java.util.Scanner;
public class Exception_number {
 
    public static void main(String[] arg)
    {
        
        int number,a;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter any valid Integer: ");
            try {
                number = Integer.parseInt(sc.next());
                a=number*number;
                System.out.println("You Square is: "+ a);

 
                System.out.println("You entered: "+ number);
 
                break;
            }

            catch (NumberFormatException e) {
 
                System.out.println("NumberFormatException occurred");

           }
        }
    }
}