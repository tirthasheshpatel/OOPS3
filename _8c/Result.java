class Result extends Exam 
{
    double marks[];
    double percentage;
    String grade;
    Result(String name, int rollno, String courses[], double marks[])
    {
        super(name, rollno, courses);
        this.marks = marks;
        this.calcPercentage();
        this.calcGrade();
    }

    private void calcPercentage()
    {
        this.percentage = 0.;
        for(int i=0;i<this.marks.length;i++)
        {
            this.percentage += marks[i];
        }
        this.percentage *= (1./marks.length);
    }

    private void calcGrade()
    {
        if(this.percentage >= 90.0) this.grade = "A+";
        else if(this.percentage >= 80.0) this.grade = "A";
        else if(this.percentage >= 70.0) this.grade = "B+";
        else if(this.percentage >= 60.0) this.grade = "B";
        else if(this.percentage >= 50.0) this.grade = "C+";
        else if(this.percentage >= 40.0) this.grade = "C";
        else this.grade = "FAIL";
    }

    void pprint()
    {
        super.pprint();
        System.out.println("Your result has been declared: ");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(super.courses[i] + ": " + this.marks[i]);
        }
        System.out.println("Your percentage: " + this.percentage);
        System.out.println("Your status: " + this.grade);
    }
}