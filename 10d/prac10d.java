import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class prac10d 
{
    public static void main(String[] args) 
    {
        File f1 = new File(args[0]);
        File f2 = new File(args[1]);

        Thread t = new Thread(new printData(f1));
        Thread t2 = new Thread(new printData(f2));

        t.start();
        t2.start();
    }
}

class printData implements Runnable 
{
    File file;

    printData(File file) 
    {
        this.file = file;
    }

    @Override
    public void run() 
    {

        Scanner input;
        Random x = new Random();

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
            try 
            {
                Thread.sleep(x.nextInt(10000));
            } 
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(file.getName() +" "+ input.nextLine());
        }
    }
}