import java.util.*;
class TestMedicine
{
    public static void main(String[] args) {
        Medicine[] arr = new Medicine[10];
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of your company: ");
        String name = in.nextLine();
        System.out.print("Enter the address of your company: ");
        String address = in.nextLine();
        for(int i=0;i<10;i++)
        {
            int randno = rand.nextInt(3);
            if(randno == 0) arr[i] = new Tablet(name, address);
            else if(randno == 1) arr[i] = new Ointment(name, address);
            else if(randno == 2) arr[i] = new Syrup(name, address);
        }
        for(int i=0;i<10;i++)
        {
            arr[i].displayLabel();
        }
    }
}