public class Box
{
    double h;
    double w;
    double d;

    public Box(double width,double height,double depth)
    { 
        h=height;
        w=width;
        d=depth;
    }


    double volume()
    {
        double v;
        v=h*w*d;
        return v;
    }


    public static void main(String[] args)
    {
        Box bc = new Box(16,10,25);
        System.out.println(bc.volume());
    }

}