import java.util.*;
class Largest
{
	int x,y,z;
	public void largeNo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 no.");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if((x>y)&&(x>z))
		{
		System.out.println("x is greater");
		}
		else if((y>x)&&(y>z))
		{
		System.out.println("y is greater");
		}
		else
		{
		System.out.println("z is greater");
		}
		
	}
	public static void main(String a[])
	{
	Largest l1=new Largest();
	l1.largeNo();
	}
}


