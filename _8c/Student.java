class Student 
{
    String name;
    int rollno;
    Student(int rollno, String name)
    {
        this.name = name;
        this.rollno = rollno;
    }
    void pprint()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollno);
    }
}