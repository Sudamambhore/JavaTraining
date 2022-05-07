class Address{
            int housenum;
            String areaname;
            String city;           


   void setHousenum(int housenum){
         this.housenum=housenum;
       }
   void setAreaname(String Areaname){
         this.areaname=Areaname;
       }
   void setCity(String city){
            this.city=city;
       }
   int getHousenum(){
         return housenum;
       }
   String getAreaname(){
      return areaname;
      }
   
   String getCity(){
   return city;
      }
}
class Student{
            int id;
            String name;
            Address adr;
            
       public void setId(int id){
         this.id=id;
       }
           
    
       public void setName(String name){
         this.name=name;
       }
           
       public void setAdr(Address adr){
         this.adr=adr;
       }
           
       public int getId(){
          return id;
       }
       public String getName(){
            return name;
            }
       public Address getAdr(){
         return adr;
       
       }
     

}

class Demo{
   public static void main(String[] args){

   Address ad=new Address();
   ad.setHousenum(1);
   ad.setAreaname("abc");
   ad.setCity("Aurangabad");

   Student st=new Student();
   int x=101;
   st.setId(x);
   st.setAdr(ad);
   st.setName("xyz");
   
   int id1;
   id1=st.getId();
   String n;
   n=st.getName();
   Address ad1;
   ad1=st.getAdr();
   int hn;
   hn=ad1.getHousenum();
   String area;
   area=ad1.getAreaname();
   String city=ad.getCity();
   }
}