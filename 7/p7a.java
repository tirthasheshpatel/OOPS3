import java.util.*;
class p7a
{
    public static void main(String args[])
    {
        String str="Nirma University";


        StringBuffer revstr=new StringBuffer(str);
        revstr.reverse();
        String str2 = revstr.toString();


        System.out.println("Reversed string is " + str2);

        String newstr=str.replace("Ni","Ab");
        System.out.println("New String is "+newstr);

        
        boolean b1=str.contains("rma");
        boolean b2=str.contains("Uni");
        if(b1) System.out.println("rma is present");
        else System.out.println("rma is not present");
        if(b2) System.out.println("Uni is present");
        else System.out.println("Uni is not present");
    }
}