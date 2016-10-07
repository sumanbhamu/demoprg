//multiplication using while loop and taing values from user
import java.util.*;
class Mul1
{
	int x,y,c;
	public void show()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter which table u want to be printed");
		x=sc.nextInt();
		System.out.println("enter till where u want to be printed");
		c=sc.nextInt();
		y=1;
		while(y<=c)
		{
			System.out.println(x + " * " +y+ " = "+ (x*y));
			y=y+1;
		}
	}
	public static void main(String a[])
	{
		Mul1 m1=new Mul1();
		m1.show();
	}
}