//Assigments Example
//Complete this with constructor String address;


import java.util.*;
class Person1{
        Scanner input=new Scanner(System.in);
        String name;
}
class Student1 extends Person1{
          int sid;
       void getdatas(){
          System.out.println("Enter Your id_number: ");
          sid =input.nextInt();
}
}
class Teacher1 extends Person1{
         int tid;
         int salary;
         String subject;
   void getdatat(){
         System.out.println("enter salary,subject of teacher,enter a teacher");
         salary =input.nextInt();
         input.nextLine();
         subject=input.nextLine();
         tid=input.nextInt();       
  }
 void displayt(){
      System.out.println("Teacher's id is:"+tid);
      System.out.println("Salary is "+salary);
      System.out.println("Subject is "+subject);
    }
    }
    
 class CollegeStudent1 extends Student1{
         int year;
         String major;
         
  void getdatacs(){
    System.out.println("Enter major subject and year of college student: ");
    major=input.nextLine();
    year=input.nextInt();
    }
 void displaycs(){
       System.out.println("Major subject is"+major );
       System.out.println("Current year is "+year);

}
}

public class Assigment{
       public static void main(String[] args) {
       Teacher1 t=new Teacher1();
       t.getdatat();
       CollegeStudent1 s=new CollegeStudent1();
       s.getdatas();
       s.getdatacs();
       t.displayt();
       System.out.println("********************");
       s.displaycs();
       }
  }  