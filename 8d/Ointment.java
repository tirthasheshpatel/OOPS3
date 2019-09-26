class Ointment extends Medicine
{
    Ointment(String name, String address)
    {
        super(name, address);
    }
    public void displayLabel()
    {
        super.displayLabel();
        System.out.println("I sound funny!");
    }
}