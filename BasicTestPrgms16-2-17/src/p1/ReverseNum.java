package p1;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		int rem,rev=0,n;
		System.out.println("enter a no...");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while(n>0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;			
		}
		System.out.println(rev);

	}

}
