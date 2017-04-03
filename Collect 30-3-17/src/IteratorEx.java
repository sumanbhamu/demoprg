
import java.util.*;
public class IteratorEx {//works on all the collection classes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet v=new HashSet();//no duplication and no insertion order--in set
		v.add(23);
		v.add(4.9);
		v.add("sss");
		v.add(true);
		v.add(23);
		Iterator i=v.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		

	}

}
