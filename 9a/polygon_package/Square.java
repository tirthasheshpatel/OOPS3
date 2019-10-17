package polygon_package;

public class Square implements Polygon
{
    public double area;
    public double peri;
    public double length;

    public Square(double length)
    {
        this.length = length;
    }

    // @Override
    public void calcArea()
    {
        this.area = this.length*this.length;
    }

    // @Override
    public void calcPeri()
    {
        this.peri = 4*this.length;
    }

    // @Override
    public void display()
    {
        System.out.println("Side length: "+this.length+"\nArea: "+this.area+"\nPerimeter: "+this.peri);
    }
}