package p1;

import java.util.Scanner;

//count no. of digits and alphabets in the given prgm
public class NoOfAlphDigi {

	public static void main(String[] args) {
		
		String str;
		char ch=' ';
		int c=0,d=0;
	
		System.out.println("enter a string....");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		
		for(int i=0;i<=str.length()-1;i++){
			
			ch=str.charAt(i);
			//str.codePointAt(i);
			if(Character.isAlphabetic(ch)){
				c++;
				
			}
				
			if(Character.isDigit(ch)){
				d++;
				
			}
			
			//System.out.println(Character.isAlphabetic(ch));
			//System.out.println(Character.isDigit(ch));
			
			
		}System.out.println("no. fo char .."+c);
		System.out.println("no.of digits .."+d);

	}

}
