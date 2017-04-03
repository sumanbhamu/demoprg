import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
2.WAP to read data from two text files and store them into one doc file using
  FileInputStream and FileOutputStream.*/
public class FileInOutStream {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f1=new FileInputStream("xyz.txt"); //read
		FileInputStream f2=new FileInputStream("su.txt");
		
		FileOutputStream fw=new FileOutputStream("multiFileIn.doc"); //write
		
		int i=0,j=0;
		
		while((i=f1.read()) !=-1){
				fw.write((char)i);
		}
		while((j=f2.read()) !=-1){
			fw.write((char)j);
			
		}

	}

}
