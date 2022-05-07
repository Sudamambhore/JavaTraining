abstract class Account{
        abstract void calculateInterest();
     }
class LuxeryCar extends Account{
    @Override
    void calculateInterest() {
       System.out.println("Calculate inerest of LuxeryCar"); 
    }
 }
class SportCar extends Account{
    @Override
    void calculateInterest() {
       System.out.println("Calculate inerest of SportCar"); 
    }   
}
class AccountFactory{
    static Account getAccount(String type){
        Account obj=null;
        if(type.equalsIgnoreCase("LuxeryCar")){
            obj=new LuxeryCar();
        }else if (type.equalsIgnoreCase("SportCar")){
            obj=new SportCar();
        }

        return obj;
    }
}
public class FactoryPattern{
public static void main(String[] args) {
    Account ob1=AccountFactory.getAccount("SportCar");   
    Account ob2=AccountFactory.getAccount("LuxeryCar");
    ob1.calculateInterest();
    ob2.calculateInterest();
  }    
}
