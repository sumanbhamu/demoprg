package h1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NoOfWords {

	public static void main(String[] args) throws Exception {
		
		FileReader f=new FileReader("xyz.txt");
		BufferedReader f1=new BufferedReader(f);
		String s1="suman bhamu hai dd";
		String a[]=s1.split(" ");
		int x=1;
		for(int i=1;i<a.length;i++){
			x++;
			//System.out.println(x);
		}
		System.out.println(x);
		//////////////////////////////to read the content
		String sum=f1.readLine();
		String sp[]=s1.split(" ");
		System.out.println(sum+".....");
		int c=0;
		for(int read=1;read<sp.length;read++){
			c++;
		}
		System.out.println("count...."+c);
		/*int s;
		while( (s=f1.read())!=-1){
			char sd=(char) s;
			System.out.print(sd);
			
			
		}*/
	}
}
