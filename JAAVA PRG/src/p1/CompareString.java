package p1;

import java.util.Scanner;

public class CompareString {
	public static void main(String args[]){
		System.out.println("enter 1st String");
		Scanner sc=new Scanner(System.in);
		 String str1 = sc.nextLine();
		
		System.out.println("enter 2nd String");
		 String str2 = sc.nextLine();
		 
		 
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		int flag=0;
		int length1=str1.length();
		int length2=str2.length();
	if(length1==length2)
		{
			for(int x=0;x<length1;x++ )
			{
				for(int y=0;y<length2;y++)
				{
					if(ch1[x]==ch2[x]){
						
					}
						else{
							flag=1;
						break;
						}
			}
		}
			
		if(flag==1)
				System.out.println("not equal");
	else{
		System.out.println("equal");
		}		
	
	}
	else{
		System.out.println("Given are not equal");
	}
	}
}
