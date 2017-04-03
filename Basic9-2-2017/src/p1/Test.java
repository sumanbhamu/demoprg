package p1;

import java.util.Scanner;

public class Test{

public static void main(String [] args){
	
	int n;
	System.out.println("enter a no.");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	if((n&1)==0){
		
		System.out.println("square "+n*n);
	}
	else{
		System.out.println("cube "+n*n*n);
	}
}}
