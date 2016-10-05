//Prg For Nested if
import java.util.*;
class NestedIf
{
	int x;
	public void checkData()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number);
	x=sc.nextInt();
	if(x>0)
	{
		if(x>10)
		{
		System.out.println("+ve and greater than 10");
		}
		else
		{
		System.out.println("+ve and not greater than 10");
		}
	}
	else
	{
	System.out.println("-ve no.");
	}
	}
	public void main(String a[])
	{
		NestedIf n1=new NestedIf();
		n1.checkData();
	}
}