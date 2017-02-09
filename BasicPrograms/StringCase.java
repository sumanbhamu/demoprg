import java.util.Scanner;
/*2.You have been given a String S consisting of uppercase and lowercase English alphabets.
You need to change the case of each alphabet in this String.
That is, all the uppercase letters should be converted to lowercase and all the lowercase 
letters should be converted to uppercase. You need to then print the resultant String to output.*/

public class StringCase {
	
	public void show(){
		String a;
		System.out.println("Enter a word");
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		for(int i=0;i<a.length();i++){
			char ch=a.charAt(i);
			
			if(Character.isUpperCase(ch)){
				System.out.print(Character.toLowerCase(ch));
			}
			else{
				System.out.print(Character.toUpperCase(ch));
			}
		}
	}

	public static void main(String[] args) {
		
		StringCase s1=new StringCase();
		s1.show();
		
	}

}
