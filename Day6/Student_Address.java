class Address{

                   int housenum;
                   String areaname;
                   String city;
         void setHousenum(int housenum) 
             {
                this.housenum = housenum;
             } 
             
         void getHousenum(int housenum) 
             {
                return housenum;
             }  
             
                
        void setAreaname(String areaname) 
             {
                this.areaname = areaname;
             }   
             
        void getAreaname(String areaname) 
             {
                return areaname;
             }     
       
        void setCity(String city) 
             {
                this.city = city;
             }   
             
        void getCity(String city) 
             {
                return city;
             }     

    }
    
   class student{
   
         int id;
         String name;
         Address Adr;
         
   public void setId(int id)
      {
          this.id = id;
      }
      
  public void SetAdr(Address adr)
     {
       this.adr=adr;
     }
     
  public int getId()
  {
       return id;
  }
  
  public Address getAdr()
  {
      return adr;
  }

}

class demo{
   public static void main(String [] args){
   Address ad=new Address();

   ad.setHousenum(1);
   ad.setAreaname("abc");
   ad.setCity("Aurangabad");

//create student class object 
    student st=new student();
    int x= id1;
          st.setId(x);
          st.setAdr(ad);
          st.setName("xyz");
//read values
  
      int id1;
            id1 = st.getId();
            String n;
            n = st.getName();
            Address ad1;
            ad1 = st.getAdr();

//read address object values

       int hn;
        hn = ad1.getHousenum();
        String area;
        area = ad1.getAreaname();
        String city = ad1.getCity();

}

}   
   
    
      
      
         


          

    