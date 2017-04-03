import java.util.Scanner;
/*
1. WAP to find Max value and min value from given numbers.(Without using arrays).*/
public class MinMax {
	public void show(){
		int n;
		System.out.println("enter n value");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int x=0,max=0,min=0;
		System.out.println("enter "+ n +" values");
		
		
		for(int i=1;i<=n;i++)
		{
			x=sc.nextInt();
			if(x>max)
			{
				max=x;
			}
			else{
				min=x;
			}
			
		}
		System.out.println("max..."+ max);
		System.out.println("min..."+ min);
		
		//int a[];
		
		
		
		
		
		/*int a,b,c;
		System.out.println("enter 3 no.");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(((a>b)&&(a>c))  ||  ((a<b)&&(a<c)))
		{
			System.out.println("a "+a);
		}
		if((b>a)&&(b>c)  ||  ((b<a)&&(b<c)))
		{
			System.out.println("b.."+b);
		}
		else{
			System.out.println("c ..."+c);

		}
*/	}
		public static void main(String arg[]){
		MinMax m1=new MinMax();
		m1.show();

		}

}
