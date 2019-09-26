class GSSArrayTest
{
    public static void main(String[] args) {
        GSSArray arr = new GSSArray(10);
        for(int i=10;i>=0;i--)
        {
            arr.insert(i);
        }
        for(int i=0;i<5;i++) arr.delete(i);
        arr.display();
    }
}