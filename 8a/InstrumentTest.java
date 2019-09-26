import java.util.*;
class InstrumentTest
{
    public static void main(String[] args) {
        Instrument arr[] = new Instrument[10];
        Random rand = new Random();
        for(int i=0;i<arr.length;i++)
        {
            int randno = rand.nextInt(3);
            if(randno==0) arr[i] = new Piano();
            else if(randno==1) arr[i] = new Guitar();
            else if(randno==2) arr[i] = new Flute();
            else System.out.println("ERROR! : 13");
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] instanceof Piano) System.out.println(i + " is Piano.");
            else if(arr[i] instanceof Guitar) System.out.println(i + " is Guitar.");
            else if(arr[i] instanceof Flute) System.out.println(i + " is Flute.");
            else System.out.println("ERROR!: 20");
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i].play();
        }
    }
}