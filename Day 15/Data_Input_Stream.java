//DataInputStream
import java.io.*;
public class Data_Input_Stream{
    public static void main(String[] args)throws Exception {
      FileInputStream fin;
      fin=new FileInputStream("D:\\Sudam\\Test3.txt");
      DataInputStream din;
      din=new DataInputStream(fin);
      int x=din.readInt();
      boolean y=din.readBoolean();
      double z=din.readDouble();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
      din.close();
    }

}
