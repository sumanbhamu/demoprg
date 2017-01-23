import java.util.Scanner;

public class AcceptStringSam {

	String str;
	public void show(){
		System.out.println("enter a value");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		char ch0=str.charAt(0);
		char ch2=str.charAt(2);
		
		char opp=str.charAt(1);
		
		/*String str0=Character.toString(ch0);
		String str2=Character.toString(ch2);*/
		
		String str0=String.valueOf(ch0);
		String str2=Character.toString(ch2);
		
		
		int x=Integer.parseInt(str0);
		int y=Integer.parseInt(str2);
		
		System.out.println("x :"+x+" y :"+y);

		switch(opp){
		
		case '+': System.out.println(x+y);
				break;
				
		case '-': System.out.println(x-y);
		break;
		
		case '*': System.out.println(x*y);
		break;
		
		
		case '/': System.out.println(x/y);
		break;
		
		
		case '%': System.out.println(x%y);
		break;
		
		
		default : System.out.println("check ur value");
		
		}
	}
	public static void main(String[] args) {
		AcceptStringSam obj=new AcceptStringSam();
		obj.show();

	}

}
