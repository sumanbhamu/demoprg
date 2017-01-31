package p1;

import java.util.Scanner;

public class CompareStr {
	
	String str1;
	String str2;
	public void show(){
		
		System.out.println("enter a value");
		Scanner sc=new Scanner(System.in);
		str1=sc.next();
		
		System.out.println("enter a value");
		str2=sc.next();
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		int flag=0;
		int j=0;
		
		
		if(str1.length()==str2.length())
		{
			
			for(int i=0;i<ch1.length;i++)
			{
				for(j=i;j<ch2.length;j++){
					if(ch1[i]==ch2[i])
					{	
						System.out.println(ch1[i]+"  "+ch2[j]);
					flag=1;
					/*break;*/
					}
					else{
						continue;
					}
					System.out.println(flag);
				}
				flag=0;
			}
		
			if(flag==1)
			{
				System.out.println(/*str1+ ch1[i]+" equals "+ch2[i]+ str2*/"equal");
			}else{
				System.out.println(/*str1+*/ " not equals "/*+str2*/);
			}
		}
		
		else{
			System.out.println("not equal");
		}
		
		
		
		
		
		/*if(str1.equals(str2))
		{
			System.out.println("both r equal  "+str1 +"  &  "+str2);
		}
		else{
			System.out.println("both not r equal  "+str1 +"  &  "+str2);
		}*/
	}

	public static void main(String[] args) {
		
		CompareStr c1= new CompareStr();
		c1.show();

	}

}
