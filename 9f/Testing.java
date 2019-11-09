import java.util.*;

class Testing
{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter Value_1: ");
        int val1 = sca.nextInt();

        System.out.print("Enter Value_2: ");
        int val2 = sca.nextInt();

        UserTrail ut = new UserTrail(val1,val2);

        try
        {
            if(!ut.show())
                throw new IllegalvalueException("Less than 0");
        }
        catch (Exception e)
        {
            System.out.println();
            System.out.println("IllegalvalueException: Less than 0");
        }
    }
}
