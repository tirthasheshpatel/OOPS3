import java.util.*;
class p7d
{
    public static void main(String args [])
    {
        Scanner in=new Scanner(System.in);
        String str;
        System.out.print("Enter a line: ");
        str=in.nextLine();
        str = " " + str;

        String s[]=str.split("[.||!||?]");

        for(int i=0;i<s.length;i++)
        {
            Arrays.sort(s);
        }

        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i] + " = " + (s[i].split(" ").length - 1));
        }
    }
}