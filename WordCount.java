package p1;

public class WordCount {
	
	String str="hellosumanhimkmk";
	static int wc=1;
	public void show()
	{
		int x;
		
		int slen=str.length();
		for(x=0;x < slen ;x++)
		{
			if(str.charAt(x) == ' '){
			wc++;
			
			}
			
		}
		System.out.println(wc);
	}

	public static void main(String[] args) {
		

		WordCount w1=new WordCount();
		w1.show();
	}

}
