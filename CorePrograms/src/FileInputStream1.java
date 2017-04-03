import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStream1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//byte stream------class
		String str="hai suman ...";
		FileOutputStream fos=new FileOutputStream("xyz.txt");
		byte b[]=str.getBytes();
		fos.write(b);
		
		//copying frm 1 file to another
		FileOutputStream fos1=new FileOutputStream("xyz.txt");  //write
		FileInputStream fis=new FileInputStream("su.txt");  //read
		int i=0;
		while((i=fis.read())!=-1){
			fos1.write((char)i);
		}
		
		
	}

}
