import java.io.FileInputStream;
import java.io.FileOutputStream;

public class picRead {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos1=new FileOutputStream("target.jpg");  //write
		FileInputStream fis=new FileInputStream("C:\\Users\\user.main\\Downloads\\images\\b1.jpg");  //read

		int i=0;
		while((i=fis.read())!=-1){
			fos1.write((byte)i);
		}
	}

}
