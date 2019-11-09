import java.util.*;

class Testing
{
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        CalcAverage c = new CalcAverage();
        System.out.print("\nEnter the number: ");
        try
        {
            int num = sca.nextInt();
            if(num<=0)
                throw new IllegalArgumentException("Number less than 1");
            else
                System.out.println(c.avgFirst(num));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Not a natural number");
        }
        catch(InputMismatchException e2)
        {
            System.out.println("Not a integer");
        }
    }
}