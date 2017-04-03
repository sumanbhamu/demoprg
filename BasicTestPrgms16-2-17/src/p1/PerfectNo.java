package p1;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		int n,sum=0;
		System.out.println("enter a no.");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
			
		}if(sum==n){
			System.out.println("perfect no.");
		}
		else{
			System.out.println("not a perfect no.");
		}

	}

}
