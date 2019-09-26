import java.util.Scanner;

class Testrect
{
	public static void main(String args[])
	{
		Rect r[]=new Rect[5];
		Scanner sc= new Scanner(System.in);
		int i;
		double l,b;
		for(i=0;i<5;i++)
		{
			System.out.print("Enter length and breadth: ");
			l=sc.nextDouble();
			b=sc.nextDouble();
			r[i]=new Rect();
			r[i].set(l,b);
			r[i].area();
			r[i].display();
		}
	}
}