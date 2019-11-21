import java.util.*;

class Variable
{
    private int a;

    int getA()
    {
        return this.a;
    }

    void setA(int a)
    {
        this.a = a;
    }
}

class Counter implements Runnable
{
    Variable a;
    Counter(Variable a)
    {
        this.a = a;
    }

    synchronized public void run()
    {
        for(int i=0;i<11;i++)
        {
            try {
                this.a.setA(i);
                Thread.sleep(500);
                notify();
                wait();
            }
            catch (Exception e) {
                System.out.println("Interupted! [Counter]");
            }
        }
    }
}

class Printer implements Runnable
{
    Variable a;
    Printer(Variable a)
    {
        this.a = a;
    }

    synchronized public void run()
    {
        while(this.a.getA()!=10)
        {
            try {
                System.out.println(this.a.getA());
                Thread.sleep(1000);
                notify();
                wait();
            }
            catch (Exception e) {
                System.out.println("Interupted! [Printer]");
            }
        }
    }
}

class Testing
{
    public static void main(String[] args)
    {
        System.out.println("Main thread object: " + Thread.currentThread());
        Variable a = new Variable();
        Thread t1 = new Thread(new Printer(a));
        Thread t2 = new Thread(new Counter(a));

        t1.setName("God");
        t2.setName("Satan");

        System.out.println("Printer thread: " + t1);
        System.out.println("Counter thread: " + t2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Interupted!");
        }
    }
}