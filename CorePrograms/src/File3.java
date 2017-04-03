import java.io.File;
// count number of files...list of files
public class File3 {

	public static void main(String[] args) {
		try{
			File f=new File("E:\\AllProgramms\\CorePrograms"); 
			String files[]=f.list();
			int c=0;
			for(int i=0;i<files.length;i++){
				c++;
				System.out.println(files[i]);
			}
		System.out.println("no of files.."+c);
			}
			catch(Exception e)
			{
				
			}
		}
}
