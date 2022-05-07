import java.io.*;  
import java.util.*;  
class Copyfile {  
 public static void main(String arg[]) throws Exception {  
  Scanner sc = new Scanner(System.in);  
  System.out.print("D:\\Sudam\\Test2 :");  
  String sfile = sc.next();  
  System.out.print("D:\\Sudam\\Test3:");  
  String dfile = sc.next();  
  FileReader fin = new FileReader(sfile);  
  FileWriter fout = new FileWriter(dfile, true);  
  int c;  
  while ((c = fin.read()) != -1) {  
   fout.write(c);  
  }  
  System.out.println("Copy finish...");  
  fin.close();  
  fout.close();  
 }  
}   