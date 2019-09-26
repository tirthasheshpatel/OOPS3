class Medicine
{
    String name;
    String address;
    Medicine(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    public void displayLabel()
    {
        System.out.println("Name of the comapany: " + this.name);
        System.out.println("Address of the comapany: " + this.address);
    }
}