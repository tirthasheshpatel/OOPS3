public class Testing
{
    public static void main(String[] args)
    {
        Thread t = new Thread(new Counter());
        Thread t2 = new Thread(new Printer());
        t.start();
        t2.start();
    }
}
