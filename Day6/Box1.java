/*8. Write a class “Box” that with three member-variables “height”, “width” and “breadth”. Write
suitable constructors to initialize them. Add functions like “getVolume” and “getArea” that will
return volume and surface area respectively. Create object of boxes and then print their volume
and surface area.*/


class Box{

    private int height,width,breadth;

    Box(){

    }

    Box(int h, int w, int b)
    {
            height = h;
            width = w;
            breadth = b;
    }

    int getVolume()
    {
            return height* width* breadth;
    }

    int getArea()
    {
            return 2 * (height*width + width*breadth + breadth*height);
    }

    public static void main(String args[])
    {
            Box b1 = new Box(1,2,3);
            System.out.println("Volume of first box is "+ b1.getVolume());
            System.out.println("Surface Area of first box is "+ b1.getArea());

            Box b2 = new Box(4,5,6);
            System.out.println("Volume of second box is " + b2.getVolume());
            System.out.println("Surface Area of second box is " + b2.getArea());
    }

}