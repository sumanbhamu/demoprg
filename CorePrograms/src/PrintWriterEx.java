import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args) throws FileNotFoundException {
		
		//printwriter-----write,print,println..mthd
		PrintWriter pw=new PrintWriter("xyz.txt");
		pw.write("sumannn");
		pw.write(100);
		pw.println("sumannn");
		pw.println(100);
		pw.print(11100);
		pw.flush();
		
		

	}

}
