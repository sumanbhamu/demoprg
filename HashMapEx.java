package p1;

import java.util.HashMap;

public class HashMapEx {

	public void show(){
		int x;
		HashMap h1= new HashMap();
		h1.put(0, "apple");
		h1.put(1, "Bat");
		h1.put(1, "Cat");
		
		
		
		System.out.println(h1);
	}
	public static void main(String[] args) {
		HashMapEx obj=new HashMapEx();
		obj.show();

	}

}
