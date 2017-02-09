import java.io.File;


public class FileLength {
// length of the data in a file
	public static void main(String[] args) {
		try {
			File fr=new File("abc.txt");
			Long l1=fr.length();
			System.out.println(l1);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
