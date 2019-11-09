import java.util.*;

class Testing
{
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        System.out.print("\nEnter Value_1 : ");
        int val1 = sca.nextInt();
        System.out.print("\nEnter Value_2 : ");
        int val2 = sca.nextInt();
        Number n = new Number(val1,val2);
        n.add();
        n.sub();
        n.mul();
        n.div();
    }
}