package p2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class A{
	public String s="aaa";
	int x=2;
	
}

class B{
	String j="bbb";
	int y=4;
	
}
public class CollectionTask1 {

	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		//String s=a.toString();
		//A b=new A();
		HashSet h1=new HashSet();
		h1.add(a);
		h1.add(b);
	//	h1.add(b);
		
		//ArrayList a=new ArrayList();
		
	
		
		/*Iterator<A>it=h1.iterator();
		while(it.hasNext())
		{*/
			String a1=a.s;
			
			System.out.println(a.s);
			System.out.println(a.x);
			System.out.println(b.j);
			System.out.println(b.y);
		//}
		
		

	}

}
