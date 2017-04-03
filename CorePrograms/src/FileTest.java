import java.io.FileReader;
import java.io.FileWriter;

public class FileTest {

	//writing into multiple files..
	public static void main(String[] args) {
		
		try{
		//File f1=new File("abc.txt");
		FileReader fr=new FileReader("xyz.txt");
		int i=0;
		
		FileWriter fw=new FileWriter("su.txt");
		FileWriter fw1=new FileWriter("sum.doc");
		
		while((i=fr.read())!=-1){
			fw.write((char)i);
			fw1.write((char)i);
		}
		fw.flush();
		fw1.flush();
			
		
		}
		catch(Exception e)
		{
			
		}
	}

}
