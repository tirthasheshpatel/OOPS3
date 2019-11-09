class Number
{
    int a;
    int b;
    double result;

    Number(int x, int y)
    {
        a = x;
        b = y;
    }

    public void add()
    {
        result = a+b;
        System.out.println("Addition" + result);
    }

    public void sub()
    {
        result = a-b;
        System.out.println("Subtraction" + result);
    }

    public void mul()
    {
        result = a*b;
        System.out.println("Multiplication" +  result);
    }

    public void div() throws ArithmeticException
    {
        try
        {
            result = a/b;
            System.out.println("Division" + result);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Divide by 0 ");
        }
    }
}