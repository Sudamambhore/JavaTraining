//Overloading

class Test{
   void add(int x,int y)
     {
       System.out.println("Int addition");
       System.out.println(x + y); 
     }
   void add(float x, float y)
   {
       System.out.println("Float addition");
       System.out.println(x + y);
   }
 }
   
 public class DemoOverload
 {
    public static void main(String[] args)
    {
       Test t1=new Test();
       t1.add(1.2f,4.5f);
       t1.add(20,30);
    }  
 }    
           
         