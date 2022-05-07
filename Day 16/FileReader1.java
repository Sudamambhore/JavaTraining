//FileReader
import java.io.*;
public class FileReader1 {
    public static void main(String[] args)throws Exception {
       
        FileReader fin;
        fin=new FileReader("D:\\Sudam\\Test1.txt");
        BufferedReader bin;
        bin=new BufferedReader(fin);
        String s1="";
        while((s1=bin.readLine())!=null){
            System.out.println(s1);
        }
        bin.close();
    }
}

