package p1;

import java.util.ArrayList;


public class ArraySetEx {

	
	public void show()
	{
		ArrayList a1=new ArrayList();
		a1.add("AAA");
		a1.add("BBB");
		a1.add("CCC");
		a1.add("DDD");
		
		a1.remove(3);
		
		a1.add(0, "ZZZ");
		
		System.out.println(a1);
	}
	public static void main(String[] args) {
		
		ArraySetEx obj=new ArraySetEx();
		obj.show();

	}

}
