//Swaping with third variable
import java.util.*;
class Swap
{
	int x,y;
	public void swapping()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 no.");
	x=sc.nextInt();
	y=sc.nextInt();
	System.out.println("Before Swapping "+x +" "+y);
 	int z=x;
	x=y;
	y=z;
	System.out.println("After Swapping "+x +" "+y);
	}
	public static void main(String a[])
	{
	Swap s1=new Swap();
	s1.swapping();
	}
}