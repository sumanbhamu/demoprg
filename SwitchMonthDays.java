//Swith month no.of days
import java.util.*;
class SwitchMonthDays
{
 
 String mname;
 public void showSwitch()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter any month");
 mname=sc.next();
 switch(mname)
 {
	case "jan":
	{
	
	System.out.println("the no. of days in this month are 31");
	break;
	}
	case "feb":
	{
	
	System.out.println("feb -the no. of days in this month are 28");
	break;
	}
	case "mar":
	{
	
	System.out.println("mar-the no. of days in this month are 31");
	break;
	}
	case "apr":
	{
	System.out.println("apr-the no. of days in this month are 30");
	break;
	}
	case "may":
	{
	System.out.println("may -the no. of days in this month are 31");
	break;
	}
	case "june":
	{
	System.out.println("june-the no. of days in this month are 30");
	break;
	}
	case "july":
	{
	System.out.println("july-the no. of days in this month are 31");
	break;
	}
	case "aug":
	{
	System.out.println("aug-the no. of days in this month are 30");
	break;
	}
	case "sept":
	{
	System.out.println("septhe no. of days in this month are 31");
	break;
	}
	case "oct":
	{
	System.out.println("oct-the no. of days in this month are 31");
	break;
	}
	case "nov":
	{
	System.out.println("nov-the no. of days in this month are 31");
	break;
	}
	case "dec":
	{
	System.out.println("dec-the no. of days in this month are 31");
	break;
	}	
	default:
	{
	System.out.println("invalid");
	}
	}
}
public static void main(String a[])
{
SwitchMonthDays s1=new SwitchMonthDays();
s1.showSwitch();
}
}