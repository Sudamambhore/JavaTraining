/*1.oops Create a class named ‘Animal’ which includes methods like eat() and sleep(). Create a child class
of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.Create
an instance of Bird class and invoke the eat, sleep and fly methods using this object. */

class Animal {
     void eat()
    {
        System.out.println("eat method");

    }
       void sleep()
    {
        System.out.println("sleep method");

    }

}
class Bird extends Animal{
    @Override
        void eat() {
        super.eat();
        System.out.println("overide eat");
    }

    @Override
       void sleep() {
        super.sleep();
        System.out.println("override sleep");
    }

       void fly()
    {
        System.out.println("in fly method");

    }
}
class Animals{
    public static void main(String[] args) {
        Animal a =new Animal();
        Bird b = new Bird();
        a.eat();
        a.sleep();
        b.eat();
        b.sleep();
        b.fly();
    }
}