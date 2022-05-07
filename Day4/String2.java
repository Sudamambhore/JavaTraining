/*Exercise 4 — One Letter per Line
Write a program that asks the user to enter a word. The program then writes that word one
character per line:
Enter a word: turtle
t
u
r
t
l
e*/

import java.util.Scanner;


class String2 {

    public static void main(String args[]) {
        System.out.println("Please enter your words");
        Scanner sc = new Scanner(System.in);


        String word = sc.next();

        for(char a : word.toCharArray())
        {
            System.out.println(a);
        }

    }

}