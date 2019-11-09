package polygon_package;

public class Rectangle implements Polygon
{
    double area;
    double perimeter;
    double length;
    double breadth;
    public Rectangle(double len,double bre)
    {
        this.length = len;
        this.breadth = bre;
    }
    
    public void calcArea()
    {
        area = length*breadth;
        
    }
    
    public void calcPeri()
    {
        perimeter = 2*(length+breadth);
        
    }

    public void display()
    {
        System.out.println("Area of Rectangle is :" + area);
        System.out.println("Perimeter of Rectangle is :" + perimeter);
    }
}
