import java.util.LinkedHashSet;

public class CollectEXX {

	public static void main(String[] args) {
		LinkedHashSet hs1=new LinkedHashSet();
		hs1.add("suman");
		hs1.add(1);
		hs1.add(1);
		
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("suman");
		hs.add(1);
		hs.add(1);
		hs.add(2);
		hs.add(2.3);
		
		hs.addAll(hs1);
		hs.removeAll(hs1);
		/*if(hs.containsAll(hs1)){
			hs.removeAll(hs);
		}*/
/*System.out.println(hs.containsAll(hs1));*/
		System.out.println(hs.equals(hs1));
		
		hs.add('c');
		hs.add(null);
		//System.out.println(hs);
		//hs.clear();
		boolean b=hs.contains(2.3);
		if(b){
		System.out.println(hs);
		System.out.println(hs1);
		System.out.println(hs.size());
		}

	}

}
