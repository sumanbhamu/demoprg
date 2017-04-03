package Pack1;

import java.util.Scanner;

//Find  factorial
public class Factoriall {

	public static void main(String[] args) {
		int f=1,x;
		
		System.out.println("enter a no...");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
		for(int n=x;n>0;n--){
			f=f*n;
		}
		System.out.println(f);
		

	}

}
