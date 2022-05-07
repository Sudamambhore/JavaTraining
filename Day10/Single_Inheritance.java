// Single level Programs

class Student{
       private int id;
       private String name;
       Student(int id, String name){
       
             this.id=id;
             this.name=name;
          }
          
           int getId(){
               return id;
          }
          
           String getName(){
              return name;
            }      
   }
class mark extends Student{
       float m1,m2;
       mark(int id,String name,float m1,float m2)
       {
            super(id, name);
            this.m1=m1;
            this.m2=m2;
       }    
   void show(){
         System.out.println("ID:-"+getId());
         System.out.println("Name:-"+getName());     
         System.out.println("Biology:-"+m1); 
         System.out.println("Chemistry:-"+m2);      
      }
 }
 
 public class Single_Inheritance{
        public static void main(String[] args)
         {
             mark ob1;
             ob1 = new mark(1,"Sudam",90,88);
             ob1.show();
         }
      }             
                  
          
             