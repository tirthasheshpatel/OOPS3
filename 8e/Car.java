class Car
{
    double speed;
    int noOfGear;
    public void drive()
    {
        this.speed = 5;
        this.noOfGear = 1;
        System.out.println("Initializing speed to: " + this.speed);
        System.out.println("Initializing gear to: " + this.noOfGear);
    }

    public void display()
    {
        System.out.println("Speed: " + this.speed);
        System.out.println("Gear: " + this.noOfGear);
    }
}