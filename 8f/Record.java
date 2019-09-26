import java.util.*;
class Record
{
    String names[];
    double marks[];
    Record()
    {
        this.names = new String[5];
        this.marks = new double[5];
    }
    Record(String names[], double marks[])
    {
        this.names = names;
        this.marks = marks;
    }
    public void readValues()
    {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<this.names.length;i++)
        {
            System.out.print("Enter name of " + "student " + (i+1) + ": ");
            this.names[i] = in.nextLine();
            System.out.print("Enter marks of " + "student " + (i+1) + ": ");
            this.marks[i] = in.nextDouble();
            in.nextLine();
        }
        in.close();
    }

    public void display()
    {
        for(int i=0;i<this.names.length;i++)
        {
            System.out.println("Name of " + " student " + (i+1) + " is: " + this.names[i]);
            System.out.println("Marks of " + " student " + (i+1) + " is: " + this.marks[i]);
        }
    }
}