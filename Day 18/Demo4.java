class Test implements Runnable{
         Thread t;
         Test(String n, int p){

        t=new Thread(this);
        t.setName(n); 
        t.setPriority (p);
        t.start();
  }

 @Override
  public void run() {
             try {
                  for (int i=0;i<5;i++){
                    System.out.println("Child thread "+t.getName()+":"+i); 
                    Thread.sleep(500);
                 } 
         }
             catch (Exception e) { 

             }

        } 
 }
public class Demo4 {
      public static void main(String[] args) {

             Test t1=new Test("A", Thread.MIN_PRIORITY); 
             Test t2=new Test("B", Thread. NORM_PRIORITY);
             Test t3=new Test("C", Thread.MAX_PRIORITY);
       try{
          for (int i=0;i<5; i++) {
          System.out.println("Main thread "+i); 
          Thread.sleep(1500);
          } 
   }
      catch(InterruptedException e) {
      
      }
   }
}
