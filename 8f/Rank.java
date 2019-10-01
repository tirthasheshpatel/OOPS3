class Rank extends Record
{
    int highestMarks;
    Rank()
    {
        this.highestMarks = 0;
    }

    public void highest()
    {
        for(int i=1;i<super.marks.length;i++)
        {
            if(marks[i]>marks[highestMarks]) this.highestMarks = i;
        }
    }

    public void display()
    {
        super.display();
        System.out.println("Highest rank is obtained by student " + (this.highestMarks+1) + " and his name and marks are: " + super.names[this.highestMarks] + " " + super.marks[this.highestMarks]);
    }
}