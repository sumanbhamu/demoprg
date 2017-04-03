import java.util.Comparator;

public class SampleComparator implements Comparator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//used to act as desc order
	@Override
	public int compare(Object a, Object b) {
		
		Integer i=(Integer)a;
		Integer j=(Integer)b;
		if(i>j){
			return -1;
		}
		else if(i<j){
			return 1;
		}else{
		
		return 0;
		}
	}

}
