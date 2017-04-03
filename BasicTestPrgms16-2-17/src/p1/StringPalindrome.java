package p1;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("suman");
		StringBuffer s=new StringBuffer();
		char strrev=' ';
		System.out.println("enter a string..");
		Scanner sc=new Scanner(System.in);
		//str=sc.
		for(int i=str.length()-1;i>=0;i--){
			strrev=str.charAt(i);
			System.out.println("strreverse..."+strrev);
			str=s.append(strrev);
		}
		
		if(str.equals(strrev)){
			System.out.println("palindrome..."+strrev);
		}
		else{
			System.out.println("not a palindrome..."+strrev);
		}
	}

}
