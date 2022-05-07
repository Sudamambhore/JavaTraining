// Inherritance

class A {
void show(){
System.out.println("In Base");
}
}

class B extends A {
void disp(){
System.out.println("In Derived");
}
}

public class DemoInheritance{
public static void main(String[] args){
B ob = new B();
ob.show();
ob.disp();

}

}