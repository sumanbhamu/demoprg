//multiplication using for loop and taking values from user
import java.util.*;
class Mul3
{
	public void show()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  which table u want ");
		int x=sc.nextInt();
		System.out.println("enter till which n. u want to print");
		int c=sc.nextInt();
		for(int y=1;y<=c;y=y+1)
		{
			System.out.println(x+" * " + y +" = " + (x*y));
		}
	}
	public static void main(String s[])
	{
		Mul3 m3=new Mul3();
		m3.show();
	}
}