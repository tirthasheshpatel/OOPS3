import java.io.*;
import java.util.Scanner;

class practice
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter something: ");
        String something = in.nextLine();
        in.close();
        System.out.print("You entered: " + something);
    }
}