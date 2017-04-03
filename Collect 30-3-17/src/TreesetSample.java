import java.util.TreeSet;

public class TreesetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// used to print in descending order....
		TreeSet s=new TreeSet(new SampleComparator());
		s.add(2);
		s.add(1);
		s.add(4);
		s.add(3);
		System.out.println(s);

	}

}
