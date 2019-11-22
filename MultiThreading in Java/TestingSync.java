import java.util.*;

class Variable
{
    private int a;
    boolean valueSet;
    boolean isDone = false;

    synchronized int getA()
    {
        while(!this.valueSet)
        {
            try {
                wait();
            }
            catch(Exception e) {
                System.out.println("Interupted! [getA]!");
            }
        }
        this.valueSet=false;
        notify();
        return this.a;
    }

    synchronized void setA(int a)
    {
        while(this.valueSet)
        {
            try {
                wait();
            }
            catch(Exception e) {
                System.out.println("Interupted! [setA]!");
            }
        }
        this.a = a;
        this.valueSet=true;
        notify();
    }
}

class Counter implements Runnable
{
    Variable a;
    Counter(Variable a)
    {
        this.a = a;
    }

    public void run()
    {
        int i=0;
        while(true)
        {
            try {
                this.a.setA(i++);
                Thread.sleep((int)(1000*Math.random()));
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

    public void run()
    {
        while(true)
        {
            try {
                System.out.println(this.a.getA());
                Thread.sleep((int)(1000*Math.random()));
            }
            catch (Exception e) {
                System.out.println("Interupted! [Printer]");
            }
        }
    }
}

class TestingSync
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