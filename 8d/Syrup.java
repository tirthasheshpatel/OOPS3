class Syrup extends Medicine
{
    Syrup(String name, String address)
    {
        super(name, address);
    }
    public void displayLabel()
    {
        super.displayLabel();
        System.out.println("Drink me, bitches!");
    }
}