
public class CountNoObject {

	static int x;
	CountNoObject(){
		x++;
		//System.out.println(x);
	}
	
	public void show()
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		CountNoObject ob1=new CountNoObject();
		CountNoObject ob2=new CountNoObject();
		CountNoObject ob3=new CountNoObject();
		CountNoObject ob4=new CountNoObject();
		CountNoObject ob5=new CountNoObject();
		
		ob3.show();
		

	}

}
