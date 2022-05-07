//What is Overriding

class A{
    void show(){
    System.out.println("In A"); 
    }
 }   
class B extends A{
          void show(){
          System.out.println("In B");
         }
}
public class DemoOverride2 { 
      public static void main(String[] args){
         //B ob=new B(); <----------Output will be In B
         A ob=new A();    //Output will be In A
         ob.show();
      }
}