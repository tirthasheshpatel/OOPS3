import java.util.*;
class p7c
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any String: ");
        String str=sc.nextLine();
        
        String s[]=str.split(" ");

        for(int i=0;i<s.length;i++)
        {
            StringBuffer revstr=new StringBuffer(s[i]);
            revstr.reverse();
            s[i]=revstr.toString();
            System.out.print(s[i]+" ");
        }
    }
}