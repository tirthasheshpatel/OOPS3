import java.util.*;

class ComplexCalculation implements Runnable
{
    public void run()
    {
        double d = 1.0;
        for(int i=1;i<100;i++)
        {
            d *= i;
        }
        // Thread.yield();
        System.out.println("The result is: " + d);
        System.out.println("Execution of calculation thread is over.");
    }
}

class TakeInput implements Runnable
{
    Scanner in;

    TakeInput() {
        this.in = new Scanner(System.in);
    }

    public void run() {
        String input = in.nextLine();
        System.out.println("Input: " + input);
        System.out.println("Execution of input thread is over.");
        notify();
    }
}

class TestingYield
{
    public static void main(String[] args) {
        System.out.println("Main thread is: " + Thread.currentThread());
        Thread t1 = new Thread(new TakeInput(), "input thread");
        Thread t2 = new Thread(new ComplexCalculation(), "calculation thread");

        t2.setPriority(1);
        t1.setPriority(10);

        t1.start();
        t2.start();
        t2.yield();

        try {
            t1.join();
            t2.join();
        }
        catch (Exception e) {
            System.out.println("Inturrupted!");
        }
    }
}