import java.io.File;

/*1.WAP to delete empty files in specific directory and count non-empty files.*/

public class DeleteFiles {

	public static void main(String[] args)throws Exception {

		int c = 0;
		File f = new File("E:\\AllProgramms\\CorePrograms\\src");
		File[]files=f.listFiles();
		for(File  f1:files)
		{
			if((f1.length())==0)
			{
				f1.delete();
			}
			if((f1.length())!=0)
			{
			System.out.println(f1+" "+f1.length());
			c++;
			}
		}
		System.out.println(c);
		

	}

}

/*File flist=new File("files[i]");
Long l1=flist.length();
// if(te[i].isFile()){
System.out.println(files[i]+"..............."+l1+"************"+flist.length());
*/

/* if((f.length())==0){
	 System.out.println(files[i].length()+"..........."+files[i]);
 }*/


//File flist=new File(files[i]);


//Long l1=f.length();
//String files[]=f.list();

/*File flist=new File("");
Long l1;

for (int i = 0; i < files.length; i++) {			
	
	flist=files[i];
	
	c++;
	
	System.out.println(files[i].length()+"..........."+files[i]+"..............."+l1);
}*/

