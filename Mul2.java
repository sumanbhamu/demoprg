//multiplication using do-while and taking values from user
import java.util.*;
class Mul2
{
	int x,y,c;
	public void show()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter which table do u want");
		x=sc.nextInt();
		System.out.println("enter no. till wher u want to be printed");
		c=sc.nextInt();
		y=1;
		do
		{
			System.out.println(x+" * "+y+" = "+(x*y));
			y=y+1;
		}while(y<=c);
	}
	public static void main(String a[])
	{
	Mul2 m2=new Mul2();
	m2.show();
	}
}


		