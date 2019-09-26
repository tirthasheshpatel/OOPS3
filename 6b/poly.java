import java.util.Scanner;

class poly
{
	Scanner sc=new Scanner(System.in);
	term t[]=new term[5];
	poly()
	{
		for(int i=0;i<t.length;i++)
			t[i]=new term();
		for(int i=0;i<t.length;i++)
		{
			int a,b;
			System.out.print("Enter value coefficient: ");
			a=sc.nextInt();
			System.out.print("Enter value exp: ");
			b=sc.nextInt();
			for(int j=0;j<i;j++)
			{
			if(b==t[j].exp)
			{
				System.out.print("Enter valid Exp: ");
			    b=sc.nextInt();
			}
			}
			if(b<0)
			{
				System.out.print("Enter valid Exp: ");
				b=sc.nextInt();
			}
			t[i].seterm(a,b);
		}
	}

	void sort()
	{
	int  max=0;
		for(int i=0;i<t.length-1;i++)
		{
			for(int j=i+1;j<t.length;j++)
			{
				if(t[i].exp>t[j].exp)
				{
				max=t[i].exp;
				t[i].exp=t[j].exp;
				t[j].exp=max;
				}
			}
		}
	}

	void display()
	{
		System.out.println("\nPolynomial is: ");
		int i=0;
		for(;i<t.length-1;i++)
		{
			System.out.print(t[i].coe + "x^" + t[i].exp + " + ");
		}
		System.out.print(t[i].coe + "x^" + t[i].exp);
	}
	public static void main(String args[])
	{
		poly p=new poly();
		p.display();
		p.sort();
		p.display();
	}
}