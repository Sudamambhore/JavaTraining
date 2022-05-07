//Buffered IO
import java.io.*;
public class Buffered_IO {
    public static void main(String[] args)throws Exception {
       
        FileInputStream fin;
        fin=new FileInputStream("D:\\Sudam\\Test1.txt");
       
        BufferedInputStream bin;
        bin=new BufferedInputStream(fin);

        FileOutputStream fout;
        fout=new FileOutputStream("D:\\Sudam\\Test2.txt");
        BufferedOutputStream bout;
        bout=new BufferedOutputStream(fout);        
        int x;
        System.out.println(fin.available());       
        do{
            x=bin.read();
            if(x!=-1){
                bout.write(x);
            }
        }while(x!=-1);
        bin.close();
        bout.close();
        System.out.println("File Copied");
        
    }

}
