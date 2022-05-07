import java.util.*;
import java.util.Map.Entry;
class Demo1{
   public static void main(String[] args){
     TreeMap<Integer,String> map1;
     map1 = new TreeMap<>();
     map1.put(10,"A");
     map1.put(20,"B");
     map1.put(30,"B");
     map1.put(40,"C");
     map1.put(50,"D");
     System.out.println(map1);
     
     Set<Integer> keys;
     keys = map1.keySet();
     System.out.println("Keys......");
     for(Integer x:keys){
        System.out.println(x);
     } 
     
     Collection<String> values;
     values=map1.values();
     System.out.println("Values...........");
     for(String v:values){
        System.out.println(v);
      }
      System.out.println("Items.......");
      
      Set<Entry<Integer,String>> items;
      items=map1.entrySet();
      for(Entry<Integer,String> e1:items){
         System.out.println(e1.getKey()+":"+e1.getValue());
       }
    }
 }      

        