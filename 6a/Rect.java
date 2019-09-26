import java.util.*;
class Rect
{
	double l,b,ar,p;
	Rect()
	{
		l=1;
		b=1;
	}
	Rect(double l1,double b1)
	{
		l=l1;
		b=b1;
	}
	void set(double len,double bre)
	{
		Scanner in = new Scanner(System.in);
		if((len>0.0)&&(len<20.0))
		{
		  	l=len;
		}
		if((bre>0.0)&&(bre<20.0))
		{
			b=bre;
		}
		else
		{
			System.out.print("Enter valid length and breadth: ");
			double templ = in.nextDouble();
			double tempb = in.nextDouble();
			this.set(templ,tempb);
		}
	}
	void area()
	{
		ar=l*b;
		System.out.println("AREA IS: "+ar);
	}
	void per()
	{
		p=2*(l+b);
	}
	double getLenght()
	{
		return l;
	}
	double getBreadth()
	{
		return b;
	}
	void display()
	{
		System.out.println("LENGTH: "+l+"\tBREADTH: "+b+"\tAREA: "+ar);
	}
	
}