import java.util.*;

//Set-------HashSet,LinkedHashSet(imple)
// Heterogenious data
// no duplication
// no insertion order--------hashset
public class CollectExample {

	public static void main(String[] args) {
		
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("suman");
		hs.add(1);
		hs.add(1);
		hs.add(2);
		hs.add(2.3);
		hs.add('c');
		hs.add(null);
		hs.add(true);
		Iterator itr=hs.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}

	}

}
