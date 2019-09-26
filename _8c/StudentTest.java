class StudentTest
{
    public static void main(String[] args) {
        double marks[] = {90,95,98};
        String subs[] = {"OOP", "DSA", "DM"};
        Result res = new Result("Tirth A Patel", 243, subs, marks);
        res.pprint();
    }
}