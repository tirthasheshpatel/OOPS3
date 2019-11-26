import java.util.*;
import java.io.*;

class ReadFile implements Runnable
{
    String path;
    ReadFile(String path)
    {
        this.path = path;
    }

    public void run()
    {
        String content = "";
        try {
            File f = new File(this.path);
            Scanner file = new Scanner(f);
            while(file.hasNextLine())
            {
                content = file.nextLine() + "\n";
                Thread.sleep((int)(1000*Math.random()));
                System.out.println(content);
            }
        }
        catch(Exception e) {}
    }
}



class FileAndThreading
{
    public static void main(String[] args) {
        System.out.println("File and Threading...");
        Thread t1 = new Thread(new ReadFile("../test_data/tirth.txt"));
        Thread t2 = new Thread(new ReadFile("../test_data/java_is_shit.txt"));
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch(Exception e) {}
    }
}