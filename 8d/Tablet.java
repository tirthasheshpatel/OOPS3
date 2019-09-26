class Tablet extends Medicine
{
    Tablet(String name, String address)
    {
        super(name, address);
    }
    public void displayLabel()
    {
        super.displayLabel();
        System.out.println("Please don't feed after mixing with water. I taste very bitter that way!!!!");
    }
}