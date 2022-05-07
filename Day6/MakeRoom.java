/*6. Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three
fields(variables). This class also has a method “volume()” to calculate the volume of this room.*/

class MakeRoom{

    private int height,width,breadth;


    MakeRoom(int h, int w, int b)
    {
            height = h;
            width = w;
            breadth = b;
    }
    int getVolume()
    {
            return height* width* breadth;
    }

public static void main(String args[])
    {
            Box b1 = new Box(1,2,3);
            System.out.println("Volume of first box is "+ b1.getVolume());
    }
      {
    
            Box b2 = new Box(4,5,6);
            System.out.println("Volume of second box is " + b2.getVolume());
  
       } 
       
    }   