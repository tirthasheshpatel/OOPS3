class Exam extends Student
{
    String courses[];
    int marks[];
    Exam(String name, int rollno, String courses[])
    {
        super(rollno, name);
        this.courses = courses;
    }

    void pprint()
    {
        super.pprint();
        System.out.println("You have been registered for exams of following courses: ");
        for(int i=0;i<this.courses.length;i++)
        {
            System.out.print(courses[i] + " ");
        }
        System.out.println();
    }
}