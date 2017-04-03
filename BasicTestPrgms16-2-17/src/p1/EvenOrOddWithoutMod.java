package p1;

import java.util.Scanner;

public class EvenOrOddWithoutMod {
public void show(){
		
		//int n;
		//System.out.println("enter a number..");
		//Scanner sc=new Scanner(System.in);
	//	n=sc.nextInt();
		for(int i=0;i<=20;i++)
		{		
		if((i&1)==0){
			System.out.println("even no."  +i);
		}
		else{
			System.out.println("odd no.."+i);
		}
		}
		
	}
	public static void main(String[] args) {
		EvenOrOddWithoutMod e1=new EvenOrOddWithoutMod();
		e1.show();
		

	}
}
