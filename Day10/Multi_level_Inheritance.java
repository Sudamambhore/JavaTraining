// Multi_level_Inheritance Programs

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
       float getM1(){
             return m1;
         }
       float getM2(){
             return m2;
          }           
  }
class Result extends mark{
  Result(int id,String name,float m1,float m2){
        super(id, name, m1, m2);
    }    
                        
 void show(){
         System.out.println("ID:-"+getId());
         System.out.println("Name:-"+getName());     
         System.out.println("Biology:-"+m1); 
         System.out.println("Chemistry:-"+m2);      
      }
 }
 
 public class Multi_level_Inheritance{
        public static void main(String[] args)
         {
             Result ob;
             ob = new Result(1,"Sudam",90,88);
             ob.show();
         }
      }             
                  
          
             