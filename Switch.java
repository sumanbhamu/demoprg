//Switch  case prg
class SwitchPrg
{
	int x;
	public void show()
	{
	x=5;
	switch(x)
	{
		case 1:
		{
		System.out.println("one");
		break;
		}
		case 2:
		{
		System.out.println("two");
		break;
		}
		case 3:
		{
		System.out.println("three");
		break;
		}
		case 4:
		{
		System.out.println("four");
		break;
		}
		case 5:
		{
		System.out.println("five");
		break;
		}
		default:
		{
		System.out.println("invalid no.");
		
		}
	}
	}
	public static void main(String a[])
	{
	SwitchPrg s1=new SwitchPrg();
	s1.show();
	}
}