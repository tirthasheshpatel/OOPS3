import java.util.*;

class Testing
{
    public static void main(String[] args)
    {
        Scanner sca  = new Scanner(System.in);
        System.out.print("\nEnter yout NAME: ");
        String name = sca.nextLine();
        System.out.print("\nEnter the account type: ");
        String type = sca.nextLine();
        System.out.print("\nENter the initial_amount to deposite: ");
        int int_amt = sca.nextInt();
        BankAccount b = new BankAccount(123456, name, type, int_amt);
        int c;
        do
        {
            System.out.println("\nEnter 1 to DEPOSITE");
            System.out.println("Enter 2 to WITHDRAW");
            System.out.println("Enter 3 to see the BALANCE");
            System.out.println("Enter 4 to see the Account_detalis");
            System.out.println("Enter 0 to EXIT");
            System.out.print("\nEnter the option :");
            c = sca.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("Enter the amount to deposit: ");
                    float amt = sca.nextFloat(); 
                    b.deposit(amt);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    amt = sca.nextFloat(); 
                    b.withdraw(amt);
                    break;
                case 3:
                    System.out.println(b.getBalance());
                    break;
                case 4:
                    b.getAccDetails();
                    break;
            }
        }while(c!=0);
    }
}