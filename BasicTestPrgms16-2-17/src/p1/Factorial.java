package p1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int f=1,n;
		System.out.println("enter a no.");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=n;i>=1;i--){
			f=f*i;
			
		}
		System.out.println(f);
	}

}
