import java.util.Scanner;

public class StringCase {
	
	public void show(){
		String a;
		System.out.println("Enter a word");
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		for(int i=0;i<a.length();i++){
			/*if(a[i].equals(a[i].upperCase))*/
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
