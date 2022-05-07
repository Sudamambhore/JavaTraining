abstract class Account{
        abstract void calculateInterest();
     }
class Saving extends Account{
    @Override
    void calculateInterest() {
       System.out.println("Calculate inerest of saving"); 
    }
 }
class Loan extends Account{
    @Override
    void calculateInterest() {
       System.out.println("Calculate inerest of Loan"); 
    }   
}
class AccountFactory{
    static Account getAccount(String type){
        Account obj=null;
        if(type.equalsIgnoreCase("saving")){
            obj=new Saving();
        }else if (type.equalsIgnoreCase("loan")){
            obj=new Loan();
        }

        return obj;
    }
}
public class Factory_pattern{
public static void main(String[] args) {
    Account ob1=AccountFactory.getAccount("loan");   
    Account ob2=AccountFactory.getAccount("saving");
    ob1.calculateInterest();
    ob2.calculateInterest();
  }    
}
