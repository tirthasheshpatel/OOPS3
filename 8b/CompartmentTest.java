import java.util.*;
class CompartmentTest
{
    public static void main(String[] args) {
        Compartment arr[] = new Compartment[10];
        Random rand = new Random();
        for(int i=0;i<arr.length;i++)
        {
            int randno = rand.nextInt(4);
            if(randno == 0) arr[i] = new FirstClass();
            else if(randno == 1) arr[i] = new Ladies();
            if(randno == 2) arr[i] = new General();
            if(randno == 3) arr[i] = new Luggage();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] instanceof FirstClass) System.out.println(i + " is FirstClass.");
            else if(arr[i] instanceof Ladies) System.out.println(i + " is Ladies.");
            else if(arr[i] instanceof General) System.out.println(i + " is General.");
            else if(arr[i] instanceof Luggage) System.out.println(i + " is Luggage.");
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i].notice();
        }
    }
}