import java.util.*;

class Outer
{
    int a = 1;
    int b = 2;
    class Inner
    {
        int c = 3;
        static class NestedInner
        {
            // NestedInner()
            // {
            //     System.out.println(c);
            // }
        }
        Inner()
        {
            // new NestedInner();
            System.out.println(a);
            System.out.println(b);
        }
    }
    Outer()
    {
        new Inner();
    }

}

class stringalgo
{
    public static void main(String[] args) {
        new Outer();
    }
}