class Emp
{
    int empID;
    String empName;
    String designation;
    double basic;
    double hra;

    Emp(int empID,String empName, String designation, double basic)
    {
        this.empID = empID;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;
    }

    public void printDET()
    {
        System.out.println("------------------------------------");
        System.out.println("Employee ID: " + empID);   
        System.out.println("Employee Name: " + empName);   
        System.out.println("Designation: " + designation);   
        System.out.println("Basic: " + basic);   
        System.out.println("------------------------------------");
        System.out.println("Net salary: " + (basic+(basic*hra)/100));
        System.out.println("------------------------------------");
    }

    public void calculateHRA()
    {
        if(designation.equals("Manager"))
            hra = 10;
        else if(designation.equals("Officer")) 
            hra = 12;
        else 
            hra = 5;
    }
}
