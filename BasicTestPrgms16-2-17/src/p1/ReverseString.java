package p1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str;
		char strrev=' ';
		System.out.println("enter a string..");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		for(int i=str.length()-1;i>=0;i--){
			strrev=str.charAt(i);
			System.out.print(strrev);
		}
		

	}

}
