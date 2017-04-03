

import java.util.*;
public class ListIteratorEX {//works only on the list interface and hs both forward and backword 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		l.add(2);
		l.add("suman");
		
		ListIterator ll=l.listIterator();
		while(ll.hasNext()){
			System.out.println(ll.next());
		}
		while(ll.hasPrevious()){
			System.out.println(ll.previous());
		}

	}

}
