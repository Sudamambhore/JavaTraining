// Unchecked_exception

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Unchecked_exception{
   static void Fun1() throws FileNotFoundException{
    try{
        FileInputStream fin;
        fin=new FileInputStream("c:/Day13/Demo1.txt");
             
        } catch (FileNotFoundException e) {
             throw e;
        }
    }
  public static void main(String[] args) {
      Fun1();
  }  
}

       