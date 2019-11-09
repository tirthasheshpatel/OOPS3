import java.util.*;
import polygon_package.Square;

class Testing
{
    public static void main(String[] args) {
        Square sq = new Square(10.);
        Rectangle r = new Rectangle(10.,20.);
        sq.calcArea();
        sq.calcPeri();
        sq.display();
    }
}