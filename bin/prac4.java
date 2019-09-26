import java.util.*;
import java.lang.Math;

class prac4
{
    public static void main(String[] args) {
        // prac4a();
        // prac4b();
        // prac4ci();
        // prac4cii();
        // prac4ciii();
        // prac4civ();
        // prac4cv();
        prac4cvi();
    }

    public static void prac4a()
    {
        final double CONSTANT = 703.;
        final double F_TO_I = 12.;

        double height = 0;

        double height_feet;
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Enter height in format `feet inch`: ");
            height_feet = in.nextDouble();
        }while(height_feet < 0);
        height += height_feet * F_TO_I;

        double height_inch;
        do{
            height_inch = in.nextDouble();
        }while(height_inch < 0 || height_inch > 12);
        height += height_inch;

        double weight;
        do{
            System.out.print("Enter weight in pounds: ");
            weight = in.nextDouble();
        }while(weight <= 0);

        double bmi = (weight/Math.pow(height,2)) * CONSTANT;

        if(bmi < 18.5) System.out.println("Person is Under-weight: " + bmi);
        else if(bmi < 24.9) System.out.println("Person is having Normal BMI: " + bmi);
        else if(bmi < 29.9) System.out.println("Person is Over-weight: " + bmi);
        else System.out.println("Person Is Obese: ");
    }

    public static void prac4b()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num_iterations = in.nextInt();
        for(int i=1;i<=num_iterations;i++) if(i%2 == 0) System.out.println("Even number found: " + i);
    }

    public static void prac4ci()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2 == 0) System.out.println("Entered integer is a even number.");
        else System.out.println("Entered integer is a odd number.");
    }

    public static void prac4cii()
    {
        Scanner in = new Scanner(System.in);
        char n = in.next().charAt(0);
        if(n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' || n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U')
            System.out.println("Entered character is a vovel.");
        else if( (n >= 'a' && n <= 'z') || (n >= 'A' && n <= 'Z') )
            System.out.println("Entered character is a consonant.");
        else if( n >= '1' && n <= '9' )
            System.out.println("Entered character is a number.");
        else System.out.println("Entered character is a special character.");
    }

    public static void prac4ciii()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean is_prime = true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i == 0){
                is_prime = false;
                break;
            }
        }
        if(is_prime) System.out.println("Entered number is a prime");
        else System.out.println("Entered number is not a prime");
    }

    public static void prac4civ()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // int n = 1001;
        int a = n;
        int m = 0;
        while(n != 0)
        {
            m = 10*m + n%10;
            n = (int)(n/10);
        }
        System.out.println("Reverse of " + a + " is " + m);
        if(a == m) System.out.println(a + " is palindrome!");
        else System.out.println(a + " is not palindrome!");
    }

    public static void prac4cv()
    {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        double a,b;
        switch(ch){
            case '+':
                a = in.nextDouble();
                b = in.nextDouble();
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case '-':
                a = in.nextDouble();
                b = in.nextDouble();
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case '*':
                a = in.nextDouble();
                b = in.nextDouble();
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case '/':
                a = in.nextDouble();
                b = in.nextDouble();
                System.out.println(a + " * " + b + " = " + (a/b));
                break;
            case '%':
                a = in.nextDouble();
                b = in.nextDouble();
                System.out.println(a + " % " + b + " = " + (a%b));
                break;
            default:
                System.out.println("Operator not found!");
        }
    }

    public static void prac4cvi()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            // for(int j=1;j<=n-i;j++) System.out.print("  ");
            for(int j=1;j<=n;j++)
            {
                if(j <= n - i) System.out.print("  ");
                else System.out.print(j-(n-i) + " ");
            }
            System.out.print("\n");
        }
    }
}