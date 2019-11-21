class Counter implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            Storage.setValue(i);
        }
    }
}