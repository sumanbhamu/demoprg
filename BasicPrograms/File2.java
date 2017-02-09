import java.io.File;
import java.io.FileReader;

public class File2 {

	//reading from files
	public static void main(String[] args) {
		try {
		File f=new File("abc.txt"); 
		FileReader fw=new FileReader(f);
		
			
			int i=0;
			while((i=fw.read())!=-1){
				System.out.println((char)i);
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
