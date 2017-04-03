import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriEx {
	
	//BufferedWriter---cannot communicate directly to files...use FileWriter
	
	public static void main(String args[]) throws IOException{
		//BufferedWriter
		FileWriter fw=new FileWriter("xyz.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("suman");
		bw.write(100);
		bw.write("\n");
		bw.write('x');
		bw.flush();
		
		//BufferedReader
		
		/*FileReader fr=new FileReader("xyz.txt");
		BufferedReader br=new BufferedReader(fr);
		int i=0;
		while((i=br.read())!=-1)
				{
			System.out.print((char)i);
				}*/
		
		//BufferedReader------ readLine()
		
		/*FileReader fr=new FileReader("xyz.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
				{
			System.out.print(str);
				}*/
	}

}
