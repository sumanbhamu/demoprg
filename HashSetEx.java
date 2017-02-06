package p1;

import java.util.HashSet;

public class HashSetEx {

	public void show(){
		
		HashSet h1= new HashSet();
		h1.add("Apple");
		
		System.out.println(h1.size());
		System.out.println(h1.contains("Apple"));
		
		System.out.println(h1);
	}
	
	
	public static void main(String[] args) {
		HashSetEx obj=new HashSetEx();
		obj.show();

	}

}
