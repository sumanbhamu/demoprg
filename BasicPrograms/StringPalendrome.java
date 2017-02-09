public class StringPalendrome {

	
	public void show(){
		StringBuffer str=new StringBuffer("iom");
		StringBuffer str6=new StringBuffer(" ");
		char str1=' ';
				
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str.charAt(i);
			System.out.println(str1);
			str6.append(str1);	
		}
		if(str.equals(str6)){
			System.out.println("YES");
		}
		else{
			System.out.println("...NO..");
		}
				//System.out.println(str6);	
			
	}
	public static void main(String[] args) {
		StringPalendrome p1=new StringPalendrome();
		p1.show();

		
	}

}
