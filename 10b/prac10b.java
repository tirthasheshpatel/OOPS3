class prac10b
{
    public static void main(String[] args) throws InterruptedException
    {
        Storage x = new Storage();
        
        
        Thread t = new Thread(new Counter(x));
        Thread t2 =  new Thread(new Printer(x));

        t.start();
        t2.start();
    }
}

class Storage
{
    int a;

    int getVal()
    {
        return a;
    }

    void setVal(int ab)
    {
        a = ab;
    }
}

class Counter implements Runnable
{
    Storage a;

    Counter(Storage k)
    {
        a = k;
    }

    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            try
            {
                synchronized(a)
                {
                    a.setVal(i);
                    System.out.println("Counter Thread: "+a.getVal());
                    a.notify();
                    a.wait();
                    
                }
            } 
            catch(Exception ignore)
            {
                ignore.printStackTrace();
            }
        }
    }
}

class Printer implements Runnable
{
    Storage a;

    Printer(Storage k)
    {
        a = k;
    }

    public void run()
    {
        while (a.getVal() < 100)
        {
            try
            {
                synchronized(a)
                {
                    System.out.println("Printer: "+a.getVal());
                    a.notify();
                    a.wait();
                }
            }
            catch(Exception ignored)
            {
                ignored.printStackTrace();
            }
        }
    }
}