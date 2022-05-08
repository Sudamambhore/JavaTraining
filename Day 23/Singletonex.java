class Singleton {
	private static Singleton single_instance = null;
	public String s;
	private Singleton(){
   
	        }
	public static Singleton getInstance()
	{
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}
}
class Ton {
	public static void main(String args[])
	{
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		Singleton c = Singleton.getInstance();
		
	 if (a == b && b == c) {
 			 System.out.println("Three objects point same memory location");
      }
 		else {
 			 System.out.println("Three objects NOT point same memory location");		
        }
	}
}
