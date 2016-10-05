//to display given char is vowel or consonent (Normal if else-if else prg)
import java.util.*;
class Vowel
{
	char ch;
	public void showChar()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a letter");
	ch=sc.next().charAt(0);
	if(ch=='a')
	{
	System.out.println("vowel "+ch);
	}
	else if(ch=='e')
	{
	System.out.println("vowel "+ch);
	}
	else if(ch=='i')
	{
	System.out.println("vowel "+ch);
	}
	else if(ch=='o')
	{
	System.out.println("vowel "+ch);
	}
	else if(ch=='u')
	{
	System.out.println("vowel "+ch);
	}
	else 
	{
	System.out.println("consonent "+ch);
	}
	}
	public static void main(String a[])
	{
	Vowel v1=new Vowel();
	v1.showChar();
	}
}	



