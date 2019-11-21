import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prac10e
{
    public static void main(String[] args) 
    {

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Thread t = new Thread(new printData2(new File(args[0])));
        Thread t2 = new Thread(new printData2(new File(args[1])));

        // IllegalArgumentException in this method
        // t.setPriority(+2);
        // t2.setPriority(-2);

        t.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t.start();
        t2.start();
    }
    
}

class printData2 implements Runnable 
{
    File file;

    printData2(File file)
    {
        this.file = file;
    }

    @Override
    public void run()
    {

        Scanner input;

        try 
        {
            input = new Scanner(file);
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File Not Found");
            return;
        }

        while (input.hasNextLine()) 
        {
            System.out.println(file.getName() +" "+ input.nextLine());
        }
    }
}