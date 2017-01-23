
public class StringRev {

	public void show()
	{
		String str="welcome";
		
		int len=str.length();
		String rev="";
		
		for(int i=len-1;i>=0;i--){
			
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse of a string is: "+rev);
	}
	public static void main(String[] args) {
		StringRev s1=new StringRev();
		s1.show();
	}

}
