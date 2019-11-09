class BankAccount
{
    int accNo;
    String custName;
    String accType;
    double balance;

    public BankAccount(int accNo,String custName, String accType, double balance)
    {
        this.accNo = accNo;
        this.accType = accType;
        this.custName = custName;
        deposit(balance);
    }

    public void deposit(double amt)
    {
        try
        {
        if(amt<=0)
            throw new IllegalArgumentException();
        else if((amt)<1000 && accType.equals("saving"))
            throw new LowBalanceException("low_balance");
        else if((amt)<5000 && accType.equals("current"))
            throw new LowBalanceException("low_balance");
        else
            balance += amt;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Not a natural number");
        }
        catch(LowBalanceException lb)
        {
            System.out.println("Balance is Low");
        }
    }

    public void withdraw(float amt)
    {
        try
        {
        if(amt<=0)
            throw new IllegalArgumentException();
        else if((balance-amt)<1000 && accType.equals("saving"))
            throw new InsufficientBalanceException("Insufficient_balance");
        else if((balance-amt)<5000 && accType.equals("current"))
            throw new InsufficientBalanceException("Insufficient_balance");
        else
            balance -= amt;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Not a natural number");
        }
        catch(InsufficientBalanceException ib)
        {
            System.out.println("Balance is Low");
        }
    }

    public float getBalance()
    {
        return balance;
    }

    public void getAccDetails()
    {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder name: " + custName);
        System.out.println("Account Type: " + accType);
        System.out.println("Account Balance: " + getBalance());
    }
}
