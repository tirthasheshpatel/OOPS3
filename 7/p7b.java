import java.util.*;
class p7b
{
    public static void main(String args[])
    {
        int vow=0,cons=0,num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        for(int i=0;i<str.length();i++)
        {
            switch(str.charAt(i))
            {
                case ' ' : break;
                case 'a' :
                case 'e' :
                case 'i' : 
                case 'o' :
                case 'u' :
                case 'A' :
                case 'E' :
                case 'I' :
                case 'O' :
                case 'U' : vow++;
                            break;
                case '0' :
                case '1' :
                case '2' :
                case '3' :
                case '4' :
                case '5' :
                case '6' :
                case '7' :
                case '8' :
                case '9' : num++;
                            break;
                default : cons++;
                            break;                          
            }
        }
        System.out.println("Number of Vowels: "+vow);
        System.out.println("Number of Consonants: "+cons);
        System.out.println("Number of Digits: "+num);
    }
}