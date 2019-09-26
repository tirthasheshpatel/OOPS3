class TestCar
{
    public static void main(String[] args) {
        Car car = new SportsCar();
        car.drive();
        car.speed = 100;
        car.noOfGear = 6;
        car.display();
    }
}