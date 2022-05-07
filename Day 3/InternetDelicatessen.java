/*Exercise 1 — Internet Delicatessen
You have been asked to write a program for the Sam and Ella Delicatessen. The program takes
daily orders from the Internet. It asks for the item, its price in cents, and if express delivery is
wanted. The program writes out the order and the charges. Regular delivery for items under $10
is $2.00; for items $10 or more delivery is free. For express delivery add $3.00.
Enter the item: Tuna Salad
Enter the price: 4.50
Overnight delivery (0==no, 1==yes): 1
Invoice:
 Tuna Salad 4.50
 delivery 5.00
 total 9.50  */


import java.util.Scanner;

public class InternetDelicatessen {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the item :");
        String s1 = ob.nextLine() ;

       // s1 = ob.nextLine();
        System.out.println("Enter the price : ");
        double price = ob.nextDouble();
        int charges = 0;
        if(price<10){
            charges = 2;
        }else
        {
            charges = 0;
        }
        System.out.println("Overnight delivery : (1/0)");
        int x = ob.nextInt();
        if(x==1){
            charges = charges+3;
        }else{
            charges = charges;
        }
        System.out.println("Invoice : ");
        System.out.println(s1 + "  "+ price);
        System.out.println("Delivery" + "     "+ charges);
        System.out.println("Total  "+ "     "+ (price+charges));

    }
}