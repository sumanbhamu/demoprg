package p1;

import java.util.Scanner;

public class ArrayInsertion {

	public void show(){
		int a[]=new int[5];
		System.out.println("enter 5 values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.print("values r : "+a[i]);
			
		}
		//System.out.println("....values r ...: "+a[2] + 8);
		
		
	}
	public static void main(String[] args) {
		ArrayInsertion a1=new ArrayInsertion();
		a1.show();

	}

}
