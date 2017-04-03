package p1;

public class ReverseStr {

	String str="welcome";
	public void show(){
		String temp="";
		
		int len=str.length();
		//String str=String.valueOf(len);
		for(int i=len-1;i>0;i--){
			System.out.print(str.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		ReverseStr r1=new ReverseStr();
		r1.show();

	}

}
