import java.io.File;
import java.io.FileWriter;

public class File1 {

	//create,write into files
	public static void main(String[] args) {
		try{
			File f=new File("abc.txt");  //.doc,mp3,mp4
			
			FileWriter fw=new FileWriter(f,true);    //for appending---true
			fw.write("Hello");
			
			//converts into unicode[ASCII value]
			fw.write(100);
			fw.write('a');
			fw.write("\\n");
			//used to save
			fw.flush();
			
			
			
			//f.createNewFile();---is to crt file//mkdir-----make dir
			
			
			/*if(f.isFile())
			{
				
			}*/
		}
		catch(Exception e){
			
		}

	}

}
