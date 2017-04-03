package p1;

import java.util.Scanner;

public class EvenOddMod {

	public void show(){
		
		int n;
		System.out.println("enter a number..");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0){
			System.out.println("even no."+n);
		}
		else{
			System.out.println("odd no.."+n);
		}
	}
	public static void main(String[] args) {
		EvenOddMod e1=new EvenOddMod();
		e1.show();
		

	}

}
