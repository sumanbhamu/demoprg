import java.util.*;
public class SampleSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hs1=new LinkedHashSet();
		hs1.add(2);
		hs1.add(9.8);
		hs1.add("aaa");
		hs1.add(true);
		hs1.add(null);//null--literal
		hs1.add("aaa");
		System.out.println(hs1);
		
		LinkedHashSet hs=new LinkedHashSet();
		
		//hs.in
		hs.add(9);
		hs.add(9.81);
		hs.add("aaammm");
		
		hs=(LinkedHashSet) hs1.clone();
		
		/*hs.addAll(hs1);*/
		
		System.out.println(hs+".....size..."+hs.size());

	}

}
