import java.io.File;
/*
3.WAP to count number of text files, number of doc files,number of jpg files
in a specific directory.*/
public class NumberOfl1 {

	static  int d=0,fi=0,c=0,tx=0,doc=0,ja=0;
	
	public static void main(String[] args) {
		
		File f = new File("E:\\AllProgramms\\TaskPrograms\\src");
		
			
		File[]files=f.listFiles();
		for(File  f1:files)
		{
			
			if(f1.isDirectory()){
				d++;
				
			}
			if(f1.isFile()){
				
				if(f1.getAbsolutePath().endsWith(".txt")==true){
					tx++;
				}
				if(f1.getAbsolutePath().endsWith(".java")==true){
					ja++;
				}
				
			//	System.out.println(f1.getAbsolutePath().endsWith(".txt")      +"...."+tx);
				fi++;
				
			}
		}
		
		System.out.println("no.of files.."+fi);
		System.out.println("no.of txt files.."+tx);
		System.out.println("no.of java files.."+ja);
		System.out.println("no.of directories.."+d);
	}
}
//}
//int d=0,fi=0,c=0;

		//System.out.println(f.length());

//System.out.println(f1);
		//	if(l1[i].is){
			//	System.out.println(l1[i]);

//String[] l1= f.list();


		//for(int i =0; i<l1.length;i++){
//System.out.println("count.."+c);
//File f1 = new File(l1[i]);

//c++;