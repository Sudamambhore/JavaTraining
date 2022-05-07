class Test implements Runnable{
          Thread t;
          Test(String n){
              t=new Thread(this);
              t.setName(n);
              t.start();
public void run() {
        try {
             for (int i=0;i<5; i++){
             System.out.println("Child thread "+i); 
             Thread.sleep (500);
        }

     } catch (Exception e) { 
     
      }
}

public class Demo1 {
       public static void main(String[] args) { 
       Test t1=new Test();
     try{
        for(int i=0;i<5;i++){
        System.out.println("Main thread "+1);
        Thread.sleep(1000);
     }
}catch(InterruptedException e) {

     }
   }
}     