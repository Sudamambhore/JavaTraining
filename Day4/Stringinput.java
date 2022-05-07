/*Write a program that asks the user to enter a word. The program will then repeat word for as
many times as it has characters: */


import java.util.*;
class Stringinput{

  public static void main(String args [])  {
              System.out.println("Enter word");
              Scanner input=new Scanner(System.in);
              String word=input.next();
              int len=word.length();
              System.out.println();
    for(int i=0;i<len;i++)
    {
          System.out.println(word);
    }
  
  }
}