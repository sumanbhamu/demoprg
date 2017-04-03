import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class PrintWriter2 {

	public static void main(String[] args) throws Exception {
		//wap to writer data into doc using printwriter and read by bufferedreader
		
		
		FileReader fr=new FileReader("sum.doc");
		BufferedReader br=new BufferedReader(fr);
		
		PrintWriter pw=new PrintWriter("xyz.txt");
		//pw.write(fr);
		String s;
		while((s=br.readLine())!=null)
				{
			
			pw.println(s);
			System.out.print(s);
			}
		pw.flush();

}
}