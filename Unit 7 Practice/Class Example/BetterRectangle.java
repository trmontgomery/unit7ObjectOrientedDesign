import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{

    public BetterRectangle(int x, int y, int h, int w)
    {
        //super.setLocation(x,y);
        //super.setSize(w,h);
        super(x, y, h, w);
    }
    
    public double getPerimeter()
    {
       double h = super.getHeight();
       double w = super.getWidth();
       double p = (2*h) + (2*w);
       return p;
    }
    
    public double getArea()
    {
       double h = super.getHeight();
       double w = super.getWidth();
       double a = h*w;
       return a;
    }
    
    public static void main(String args[])
    {
        BetterRectangle awesome = new BetterRectangle(0,0,6,6);
        System.out.print("Perimeter: " + awesome.getPerimeter() + " Area: " + awesome.getArea()); 
    }

}
