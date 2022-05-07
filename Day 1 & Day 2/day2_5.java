         //Write a   program to input any alphabet and check whether it is vowel or consonant
import java.util.Scanner;
class day2_5 {

    public static void main(String args[]) {

        char ch = 't';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}