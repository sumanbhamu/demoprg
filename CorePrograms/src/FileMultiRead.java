import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileMultiRead {

	//read from mutiple files..............
	public static void main(String[] args) throws Exception {
		
		FileReader f=new FileReader("xyz.txt");
		FileReader f1=new FileReader("su.txt");
		FileWriter fw=new FileWriter("mulread.txt",true);
		
		int i=0;
		while(((i=f.read())!=-1)  && ((i=f1.read())!=-1)){
			
			fw.write("xyz.txt");
			System.out.println((char)i);
			
		}
		System.out.println("success....");

	}

}
