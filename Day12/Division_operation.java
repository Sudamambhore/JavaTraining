/*Write a Program with a division method who receives two integer numbers and performs the division
operation. The method should declare that it throws ArithmeticException. This exception should be
handled in the main method.*/




class Division_operation{
public static void Example1(int num1,int num2) throws ArithmeticException {

      try{
          num1=30;
          num2=0;
          int output=num1/num2;
         System.out.println("Result: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("You divide a number by zero");
      }
  }
 } 
