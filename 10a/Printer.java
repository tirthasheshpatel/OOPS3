class Printer implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 20; i++)
        {
            System.out.println(Storage.getValue());
        }
    }
}
