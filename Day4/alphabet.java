  //Write program to print alphabets from a to z using while loop

import java.util.*;
class Alphabet
{
  public static void main(String args[])
  {
    System.out.println("Printing Alphabets a-z: ");  
    for(char i = 'a' ; i <= 'z'; i++)      {
      System.out.printf(" %c ",i);  // space should be given beside %c.
    }
  }
}