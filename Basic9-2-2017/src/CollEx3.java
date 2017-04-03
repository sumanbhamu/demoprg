import java.util.LinkedHashSet;

public class CollEx3 {

	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("suman");
		hs.add(1);
		hs.add(1);
		hs.add(2);
		hs.add(2.3);
		hs.remove(2);
		//System.out.println(hs);
		hs.add('c');
		hs.add(null);
		//System.out.println(hs);
		//hs.clear();
		boolean b=hs.contains(2.3);
		if(b){
		System.out.println(hs);
		System.out.println(hs.size());
		}

	}

}
