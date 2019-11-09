import java.util.*;

class Testing
{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.print("Enter employee ID: ");
        int empID = sca.nextInt();

        System.out.print("Enter employee Name: ");
        sca.nextLine();
        String empName = sca.nextLine();

        System.out.print("Enter employee Designation: ");
        String designation = sca.nextLine();
        
        System.out.print("Enter employee Basic salary: ");
        double basic = sca.nextDouble();

        Emp e1 = new Emp(empID,empName,designation,basic);
        e1.calculateHRA();
        
        try
        {
            if(basic<500)
                throw new LowSalException("Basic salary is too low.");
            else 
                e1.printDET();
        }
        catch (LowSalException e)
        {
            System.out.println();
            System.out.println("Basic salary is too low");
        }
    }
}
