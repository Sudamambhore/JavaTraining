  //Write a   program to input angles of a triangle and check whether triangle is valid or not.
import java.util.Scanner;
class day2_6 {
	private static Scanner sc;

	public static void main(String[] args) {
		double side1, side2, side3,sum;
		sc = new Scanner(System.in);		
		System.out.println("Please Enter Three sides of Triangle ");
		side1 = sc.nextDouble();
		side2 = sc.nextDouble();
		side3 = sc.nextDouble();
		sum = side1 + side2 + side3; 
		if(side1 + side2  + side3 ==180)
       {
			System.out.println("It is a Valid Triangle");
		}
      	else
          	{
			System.out.println("It is Not a Valid Triangle");
		}
	}
}